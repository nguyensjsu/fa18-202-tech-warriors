import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Jewel2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PinkJewel extends Jewel implements IJewel
{

    int level_num;
    //Sound Event
    private EventSoundClient client = new EventSoundClient();
    /**
     * Act - do whatever the Jewel2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
         Actor actor = getOneIntersectingObject(GameAladdin.class);
        if(actor != null)
        {
            processJewels();  
        }       
    }  
    public PinkJewel()
    {
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()/15;
        int myNewWidth = (int)myImage.getWidth()/20;
        myImage.scale(myNewWidth,myNewHeight);// Add your action code here.
    }
    public PinkJewel(int x)
    {
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()/15;
        int myNewWidth = (int)myImage.getWidth()/20;
        myImage.scale(myNewWidth,myNewHeight);// Add your action code here.
        level_num = x;

    }
    /**
     * Set next level
     * @param x level number
     */    
    public void setlevel(int x){
        level_num = x;
    } 
    @Override
    public void updateScore() {
    } 
    /**
     * Increment score when aladdin collects the jewels
     * @param x level number
     */        
    public void incrementScore()
    {
        if(level_num == 0) {
            PalaceWorld palace = (PalaceWorld)getWorld();
            palace.aladdin.jewelsCollected++;
            palace.aladdin.setScoreState(this.getClass().getName());
            client.handleSoundEvent("collectjewels");
        }
        else if(level_num == 1) {
            PalaceWorld2 palace = (PalaceWorld2)getWorld();
            palace.aladdin.jewelsCollected++;
            palace.aladdin.setScoreState(this.getClass().getName());
            client.handleSoundEvent("collectjewels");
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
     * Decrease Jewel count 
     * @param x level number     
     */         
    public void decreaseCount()
    {
        if(level_num == 0)
        { 
            PalaceWorld palace = (PalaceWorld)getWorld();
            palace.decrease_jewels();
        }
        else if(level_num == 1)
        {
            PalaceWorld2 palace = (PalaceWorld2)getWorld();
            palace.decrease_jewels(); 
        }
    }     
}
