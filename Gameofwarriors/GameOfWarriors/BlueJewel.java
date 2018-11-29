import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Create Jewels on the screen
 * @jainsupriya
 * @V1.0
 */
public class BlueJewel extends Jewel implements IJewel
{

    int level_num;

    public BlueJewel(int x)
    {
        level_num = x;
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
    /**
     * Set next level
     * @param x level number
     */    
    public void setlevel(int x)
    {
        level_num = x;
    }   
    //parent class method
    @Override
    public void updateScore() 
    {     

    }  
    /**
     * Increment score once aladdin collect the jewels
     * @param x level number
     */       
    public void incrementScore(int x)
    {
        if(x == 0) {
            PalaceWorld palace = (PalaceWorld)getWorld();
            palace.aladdin.jewelsCollected++;
            palace.aladdin.setScoreState(this.getClass().getName());
        }
        else if(x == 1) {
            PalaceWorld2 palace = (PalaceWorld2)getWorld();
            palace.aladdin.jewelsCollected++;
            palace.aladdin.setScoreState(this.getClass().getName());
        }
    }
    /**
     * Remove jewels from the world
     */       
    public void removeFromWorld()
    {
        getWorld().removeObject(this);
    }
    /**
     * Decrease Jewel count from the world
     * @param x level number     
     */      
    public void decreaseCount(int x)
    {
        if(x == 0)
        { 
            PalaceWorld palace = (PalaceWorld)getWorld();
            palace.decrease_jewels();
        }
        else if(x == 1)
        {
            PalaceWorld2 palace = (PalaceWorld2)getWorld();
            palace.decrease_jewels(); 
        }
    }    
}
