import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LifeImage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LifeCount extends Life
{
    public int lifeCount = 3;
    public String state= "";
    
    /**
     * Act - do whatever the LifeImage wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        
    }    
    public void updateLife()
    {
        GameAladdin aladdin = (GameAladdin)getWorld().getObjects(GameAladdin.class).get(0);
        PalaceWorld palace = (PalaceWorld)getWorld();
        state = palace.aladdin.getMarioState();
        if(state =="dead"){
        }
        else if(state =="gotLife"){
        }
        
        
    }
   
}
