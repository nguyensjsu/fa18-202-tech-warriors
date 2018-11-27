import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Create Jewels on the screen
 * @jainsupriya
 * @V1.0
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
        myImage.scale(myNewWidth,myNewHeight);
        

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
            decreaseCount(level_num);
            removeFromWorld();
            
        }      
    }
    public void setlevel(int x){
        level_num = x;
    }    
    @Override
    public void updateScore() {   	
    }    
}
