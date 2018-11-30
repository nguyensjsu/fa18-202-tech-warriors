import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BottomBar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BottomBar extends JumpBar
{
    /**
     * Act - do whatever the BottomBar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }  
    public BottomBar( )
    {
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight();
        int myNewWidth = (int)myImage.getWidth()*5/2;
        myImage.scale(myNewWidth,myNewHeight);// Add your action code here.  
    }     
}
