import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class Level here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level extends Actor
{
    // instance variables - replace the example below with your own
    private int level_num;
    private PalaceWorld world1;
    private PalaceWorld2 world2;    
    private IGameLevelStrategy level_strat;

    /**
     * Constructor for objects of class Level
     */
    public Level(PalaceWorld world)
    {
           world1 = world;
           level_strat = new Level0Strategy(world1);
           //this.world.addObject(new Enemies(), 800, 200);
        
    }

    /**
     * Constructor for objects of class Level
     */
    public Level(PalaceWorld2 world)
    {
           world2 = world;
           level_strat = new Level1Strategy(world2);
           //this.world.addObject(new Enemies(), 800, 200);
        
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void setLevel(int x, PalaceWorld2 world)
    {
        level_num = x;
        switch(level_num){
            case 1: world2 = world;
                    level_strat = new Level1Strategy((PalaceWorld2) world);
                    break;
        }
    }
    
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void displayLevel()
    {
        level_strat.display();
    }
    
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void resetLevel()
    {
        
    }         
    
    /**
     * Act - do whatever the Level wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}
