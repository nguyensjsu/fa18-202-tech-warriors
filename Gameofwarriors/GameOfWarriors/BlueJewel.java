import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BlueJewel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BlueJewel extends Jewel implements IJewel
{

    int level_num;

    public BlueJewel(/*int x*/)
    {
        //level_num = x;
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()/25;
        int myNewWidth = (int)myImage.getWidth()/25;
        myImage.scale(myNewWidth,myNewHeight);// Add your action code here.
        

    }
    /**
     * Act - do whatever the BlueJewel wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public void act() 
    {
        Actor actor = getOneIntersectingObject(GameAladdin.class);
        if(actor != null)
        {
            incrementScore(level_num);
            //removeFromList();
            decreaseCount(level_num);
            removeFromWorld();
            
        }        // Add your action code here.
    }

    public void setlevel(int x){
        level_num = x;
    }    
    	@Override
    public void updateScore() {
    	// TODO Auto-generated method stub
    	
    }    
}
