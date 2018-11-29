import greenfoot.*;  

/**
 * Aladdin will collect Jewel to get points
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Jewel extends Actor 
{

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
        incrementScore();
        decreaseCount();
        removeFromWorld();
    }
    abstract void incrementScore();
    abstract void removeFromWorld();
    abstract void decreaseCount();
     
}
