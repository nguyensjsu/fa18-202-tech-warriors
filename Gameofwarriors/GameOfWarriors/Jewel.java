import greenfoot.*;  

/**
 * Aladdin will collect Jewel to get points
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

    }    
    public Jewel()
    {
        
    }
     /**
     * Template for template pattern
     */   
    public final void processJewels()
    {
        incrementScore(level_num);
        decreaseCount(level_num);
        removeFromWorld();
    }
    abstract void incrementScore(int x);
    abstract void removeFromWorld();
    abstract void decreaseCount(int x);
    
    public void setlevel(int x){
        level_num = x;
    }  
}
