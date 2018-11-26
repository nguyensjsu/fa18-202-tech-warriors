import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Jewel2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PinkJewel extends Jewel1
{
    /**
     * Act - do whatever the Jewel2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
         Actor actor = getOneIntersectingObject(GameAladdin.class);
        if(actor != null)
        {
            incrementScore();
            //removeFromList();
            decreaseCount();
            removeFromWorld();
            
        }       // Add your action code here.
    }   
    public PinkJewel()
    {
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()/10;
        int myNewWidth = (int)myImage.getWidth()/10;
        myImage.scale(myNewWidth,myNewHeight);// Add your action code here.
        

    }
}
