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
        // Add your action code here.
        
       /* if(this.getX()==300)
        {
            move(2);
        }
        else
        move(-2);*/
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
