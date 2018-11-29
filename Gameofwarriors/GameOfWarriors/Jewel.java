import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Jewel1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Jewel extends Actor 
{
    public int level_num;

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
            processJewels();
        }
    }    
    public Jewel()
    {
        
    }
    public final void processJewels()
    {
        incrementScore(level_num);
        removeFromWorld();
        decreaseCount(level_num);
        
    }
    abstract void incrementScore(int x);
    abstract void removeFromWorld();
    abstract void decreaseCount(int x);
    
    public void setlevel(int x){
        level_num = x;
    }  
}
