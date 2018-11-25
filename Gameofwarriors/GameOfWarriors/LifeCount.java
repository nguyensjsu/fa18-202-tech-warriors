import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LifeImage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LifeCount extends Life
{
    public int lifeCount = 2;
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
            if(lifeCount ==3)
            {
                getWorld().removeObjects(getWorld().getObjectsAt(220, 26,LifeCount.class));
                lifeCount--;
            }
             else if(lifeCount ==2)
            {
                getWorld().removeObjects(getWorld().getObjectsAt(190, 26,LifeCount.class));
                lifeCount--;
            } 
             else  if(lifeCount ==1)
            {
                // game over sound
                getWorld().removeObjects(getWorld().getObjectsAt( 160, 26,LifeCount.class));
                lifeCount--;
                Greenfoot.stop();   
            }                
            
        }
        else if(state =="gotLife"){
            LifeCount lifecount = new LifeCount();
            
            if(lifeCount ==2)
            {
                getWorld().addObject(lifecount,220, 26);
                lifeCount++;
                System.out.println("here");
            } 
            else if (lifeCount ==1)
            {
                getWorld().addObject(lifecount,190, 26 );
                lifeCount++;               
                
            }
            
                
        }
        
        
    }
   
}
