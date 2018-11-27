import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GreenJewel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GreenJewel extends Jewel implements IJewel
{
    /**
     * Act - do whatever the YellowJewel wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }
    public GreenJewel()
    {
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()/15;
        int myNewWidth = (int)myImage.getWidth()/15;
        myImage.scale(myNewWidth,myNewHeight);// Add your action code here.
    }
    @Override
    public void updateScore() {
    	// TODO Auto-generated method stub
    	
    }
}
