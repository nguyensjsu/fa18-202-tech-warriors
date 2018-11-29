import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Right_arrow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RightArrow extends Actor
{
    GreenfootImage myImage = null;
    /**
     * Act - do whatever the Right_arrow wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public RightArrow()
    {
        myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()/2;
        int myNewWidth = (int)myImage.getWidth()/2;
        myImage.scale(myNewWidth,myNewHeight);// Add your action code here.
    }
    
    public void act() 
    {
        // Add your action code here.
    }    
}
