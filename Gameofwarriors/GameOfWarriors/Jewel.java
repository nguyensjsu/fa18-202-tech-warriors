import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Jewel1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jewel extends Actor 
{
    int level_num;

    /**
     * Act - do whatever the Jewel1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.

    }    
    public Jewel()
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
   /* public void removeFromList()
    {
        PalaceWorld palace = (PalaceWorld)getWorld();
        palace.getJewels().remove(this);
    }*/
    
   public void removeFromWorld(){
        getWorld().removeObject(this);
    }

    public void decreaseCount(int x){
        if(x == 0){ 
            PalaceWorld palace = (PalaceWorld)getWorld();
            palace.decrease_jewels();
        }
        else if(x == 1){
            PalaceWorld2 palace = (PalaceWorld2)getWorld();
            palace.decrease_jewels(); 
        }
        //palace.update_jewel_count();
    }
    
    public void setlevel(int x){
        level_num = x;
    }  
}
