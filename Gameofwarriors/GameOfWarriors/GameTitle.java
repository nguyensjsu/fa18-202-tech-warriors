import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameTitle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameTitle extends Actor
{
    /**
     * Act - do whatever the GameTitle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
    public GameTitle()
    {
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight();
        int myNewWidth = (int)myImage.getWidth()/2;
        myImage.scale(myNewWidth,myNewHeight);
    }
}
