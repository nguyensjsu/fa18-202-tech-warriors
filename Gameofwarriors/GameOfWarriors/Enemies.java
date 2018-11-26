import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enimies here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemies extends Actor
{
    private int turnSpeed = 2;
    private boolean moveRight = false;
    public Enemies()
    {
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()/15;
        int myNewWidth = (int)myImage.getWidth()/15;
        myImage.scale(myNewWidth,myNewHeight);
    }
        
    /**
     * Act - do whatever the Enimies wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (!moveRight)
        {
            setImage("enemyLeft1.png");
            move(-2);
        }
        else
        {
            setImage("enemyRight.png");
            move(2);
        }
        if(this.getX() <= 240)
        {
            move(2);
            moveRight = true;
            setImage("enemyRight.png");
        }
        if(this.getX() >= 365)
        {
            move(-2);
            moveRight = false;
            setImage("enemyLeft1.png");
        }
       //onJumpBar();
    }  
        public void onJumpBar()
    {
        //Actor turnObj = getOneObjectAtOffset(0, 0, JumpBar.class);
        //return turnObj!=null;  
        //if(getX() <= 180)
          //  moveRight();
        if(getX()>180 ) {
            moveLeft();
        }
        if(getX() <= 180 )
            moveRight();
    }
    public void moveRight()
    {     
        move(2);     
    }
    public void moveLeft()
    {
        move(-2);  
    }  
    /*public void checkTurn()
    {
        if(!onJumpBar())
            moveLeft();
        else
            moveRight();
    }  */  
}
