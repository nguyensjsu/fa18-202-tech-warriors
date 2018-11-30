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
    public int level;
    //Sound Event
    private EventSoundClient client = new EventSoundClient();
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
        if(level == 0){
           PalaceWorld palace = (PalaceWorld)getWorld();
           state = palace.aladdin.getAladdinState();
           if(state =="dead"){
              loseLife();
           }
           else if(state == "gotLife"){
              gainLife();
           }
        }
        else if(level == 1){
           PalaceWorld2 palace = (PalaceWorld2)getWorld();
           state = palace.aladdin.getAladdinState();
           if(state =="dead"){
              loseLife();
           }
           else if(state == "gotLife"){
              gainLife();
           }
        }
        
    }

    public void loseLife()
    {
            
            if(lifeCount ==3)
            {
                
                lifeCount--;
                getWorld().removeObjects(getWorld().getObjectsAt(150, 25,LifeCount.class));
                
            }
             else if(lifeCount ==2)
            {
                lifeCount--;
                getWorld().removeObjects(getWorld().getObjectsAt(120, 25,LifeCount.class));
                
            } 
             else  if(lifeCount ==1)
            {
                World world = getWorld();
                // game over sound
                lifeCount--;
                getWorld().removeObjects(getWorld().getObjectsAt( 90, 25,LifeCount.class));             
                world.addObject(new GameOver(), world.getWidth()/2, world.getHeight()/2);
                client.handleSoundEvent("stop");
                client.handleSoundEvent("gameover");
                Greenfoot.stop();
            }  
    }

    public void gainLife()
    {
            LifeCount lifecount = new LifeCount();
            
            if(lifeCount ==2)
            {
                getWorld().addObject(lifecount,150, 25);
                lifeCount++;
            } 
            else if (lifeCount ==1)
            {
                getWorld().addObject(lifecount,120, 25 );
                lifeCount++;               
                
            }
    } 

    public void setLifeWorld (int level)
    {
       this.level = level;
    }
   
}
