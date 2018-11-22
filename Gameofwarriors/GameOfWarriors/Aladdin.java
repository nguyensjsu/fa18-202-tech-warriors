import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Aladdin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Aladdin extends Actor
{
    public Aladdin()
    {
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()*3/4;
        int myNewWidth = (int)myImage.getWidth()*3/4;
        myImage.scale(myNewWidth,myNewHeight);
    }
    /**
     * Act - do whatever the Aladdin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
    }    
}
