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

    /**
     * Act - do whatever the Jewel2 wants to do. This method is called whenever
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
            
        }       
    }  
    public PinkJewel()
    {

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
