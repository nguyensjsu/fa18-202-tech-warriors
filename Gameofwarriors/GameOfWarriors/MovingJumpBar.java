import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MovingJumpBar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MovingJumpBar extends JumpBar
{
    private boolean moveRight = false;
    private int jumpbarWidth = 350;
    int startPos =0;
    /**
     * Act - do whatever the MovingJumpBar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (!moveRight)   
            move(-1);
        else
            move(1);

        if(this.getX() <= startPos-jumpbarWidth/2)
        {
            move(1);
            moveRight = true;
        }
        if(this.getX() >= startPos)
        {
            move(-1);
            moveRight = false;
        }
    }     
    public MovingJumpBar(int startPos)
    {
        this.startPos = startPos;
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()/2;
        int myNewWidth = (int)myImage.getWidth()/6;
        myImage.scale(myNewWidth,myNewHeight);// Add your action code here.   
    } 
    
}
