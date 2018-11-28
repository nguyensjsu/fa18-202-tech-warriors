import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level0Strategy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level0Strategy extends Actor implements IGameLevelStrategy
{
    // instance variables - replace the example below with your own
    private PalaceWorld world;    

    public Level0Strategy(PalaceWorld world)
    {
        this.world = world;
        //this.world.addObject(new Enemies(), 800, 200);
    }

    /**
     * Act - do whatever the Level0Strategy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }

    public void display()
    {
        world.addObject(new JumpBar(), 300, 600);
        world.addObject(new JumpBar(), 640, 500);
        world.addObject(new JumpBar(), 410, 340);
        world.addObject(new JumpBar(), 540, 140);
        world.addObject(new JumpBar(), 880, 300);
        //world.addObject(new Enemies(), 345, 540); 
    }    
}