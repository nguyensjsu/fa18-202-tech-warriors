import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class JewelsCollection here.
 * 
 * @author jainsupriya
 * @version (a version number or a date)
 */
public abstract class JewelsCollection extends Actor
{
    protected int pointX;
    protected int pointY;
    /**
     * Act - do whatever the JewelsCollection wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        Actor actor = getOneIntersectingObject(GameAladdin.class);
        if(actor != null)
        {
            incrementScore();
            removeFromList();
            removeFromWorld();
            
        }
    }   
    public int getX()
    {
        return pointX;
    }
    public int getY()
    {
        return pointY;
    }
    public abstract void incrementScore();
    public abstract void removeFromList();
    
    public void removeFromWorld(){
        getWorld().removeObject(this);
    }
    

    
}
