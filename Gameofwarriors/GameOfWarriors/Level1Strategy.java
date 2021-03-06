import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level1Strategy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level1Strategy extends Actor implements IGameLevelStrategy
{
    // instance variables - replace the example below with your own
    private PalaceWorld2 world;    

    public Level1Strategy(PalaceWorld2 world)
    {
        this.world = world;
        //this.world.addObject(new Enemies(), 800, 200);
    }

    /**
     * Act - do whatever the Level1Strategy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }

    public void display()
    {
        world.addObject(new BigJumpBar(), 200, 610);
        world.addObject(new BigJumpBar(), 385, 550);
        world.addObject(new BigJumpBar(), 620, 464);
        world.addObject(new BigJumpBar(), 800, 300);
        world.addObject(new BigJumpBar(), 950, 180);
        world.addObject(new BigJumpBar(), 900, 600);
        world.addObject(new BigJumpBar(), 200, 350);
    }    
}
