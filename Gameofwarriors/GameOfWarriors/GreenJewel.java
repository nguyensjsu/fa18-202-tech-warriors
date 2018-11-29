import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Create Jewels on the screen
 * @jainsupriya
 * @V1.0
 */
public class GreenJewel extends Jewel implements IJewel
{

    int level_num;

    public GreenJewel(int x)
    {
        level_num = x;
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()/15;
        int myNewWidth = (int)myImage.getWidth()/20;
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
    public void setlevel(int x)
    {
        level_num = x;
    }    
    @Override
    public void updateScore() 
    {     
    }  
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
    
    public void removeFromWorld()
    {
        getWorld().removeObject(this);
    }
    
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
