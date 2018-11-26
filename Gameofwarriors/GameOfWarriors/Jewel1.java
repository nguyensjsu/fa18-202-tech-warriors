import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Jewel1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jewel1 extends Actor
{
    /**
     * Act - do whatever the Jewel1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        Actor actor = getOneIntersectingObject(GameAladdin.class);
        if(actor != null)
        {
            incrementScore();
            //removeFromList();
            decreaseCount();
            removeFromWorld();
            
        }
    }    
    public Jewel1()
    {
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()/25;
        int myNewWidth = (int)myImage.getWidth()/25;
        myImage.scale(myNewWidth,myNewHeight);// Add your action code here.
        

    }
    public Jewel1(int getX, int getY)
    {
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()/20;
        int myNewWidth = (int)myImage.getWidth()/20;
        myImage.scale(myNewWidth,myNewHeight);// Add your action code here.
    }
    public void incrementScore()
    {
        PalaceWorld palace = (PalaceWorld)getWorld();
        palace.aladdin.jewelsCollected++;
        palace.aladdin.setScoreState(this.getClass().getName());
    }
   /* public void removeFromList()
    {
        PalaceWorld palace = (PalaceWorld)getWorld();
        palace.getJewels().remove(this);
    }*/
    
   public void removeFromWorld(){
        getWorld().removeObject(this);
    }

    public void decreaseCount(){
        PalaceWorld palace = (PalaceWorld)getWorld();  
        palace.decrease_jewels();
        //palace.update_jewel_count();
    }
  
}
