import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameAladdin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameAladdin extends Actor
{
 
    private int fallSpeed = 0;
    private int accelaration = 2;
    private int jumpStrength=7;
    
    public GameAladdin()
    {
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()/4;
        int myNewWidth = (int)myImage.getWidth()/4;
        myImage.scale(myNewWidth,myNewHeight);// Add your action code here.
    }
    /**
     * Act - do whatever the GameAladdin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(getOneIntersectingObject(Enemies.class)!= null){
            Greenfoot.stop();    
        }
        checkKeys();
        checkFall();
    }    
    public void checkKeys()
    {
         if(Greenfoot.isKeyDown("right"))
         {
             moveRight();
         }
         if(Greenfoot.isKeyDown("left"))
         {
             moveLeft();
         }
         if(Greenfoot.isKeyDown("space"))
         {
             jump();
         }
    }
    public boolean onJumpBar()
    {
        Actor fallObj = getOneObjectAtOffset(0, this.getImage().getHeight()/2, JumpBar.class);
        return fallObj!=null;       
    }
    public void moveRight()
    {     
        move(3);     
    }
    public void moveLeft()
    {
        move(-3);  
    } 
    public void fall()
    {
        setLocation(getX(), getY()+fallSpeed);
        fallSpeed = fallSpeed+accelaration;
    }
    public void checkFall()
    {
        if(onJumpBar())
            fallSpeed=0;
        else
            fall();
    }
    public void jump()
    {
        fallSpeed = -jumpStrength;
        fall();
    }
    
}
