import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameSuccess here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameSuccess extends Actor
{
    GreenfootImage myImage = null;
    public GameSuccess()
    {
        myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()*17/10;
        int myNewWidth = (int)myImage.getWidth()*2;
        myImage.scale(myNewWidth,myNewHeight);// Add your action code here.
    }
    /**
     * Act - do whatever the GameSuccess wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
    }   
}
