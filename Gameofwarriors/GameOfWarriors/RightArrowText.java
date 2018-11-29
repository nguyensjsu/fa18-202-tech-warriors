import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RightArrowText here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RightArrowText extends Actor
{
    GreenfootImage myImage = null;
    /**
     * Act - do whatever the Left_arrow wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public RightArrowText()
    {
        myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()/3;
        int myNewWidth = (int)myImage.getWidth()/3;
        myImage.scale(myNewWidth,myNewHeight);// Add your action code here.
    }
    /**
     * Act - do whatever the RightArrowText wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}
