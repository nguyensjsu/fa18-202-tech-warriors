
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MovingLife here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MovingLife extends Life
{
    /**
     * Act - do whatever the MovingLife wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
             // Add your action code here.
        move(3);
        randomTurn();
        turnAtEdge();
        Actor actor = getOneIntersectingObject(GameAladdin.class);
        if (actor != null) 
        {
            incrementScore();
            removefromWorld();
        }
        
    }   
    public void incrementScore()
    {
        GameAladdin aladdin = (GameAladdin)getWorld().getObjects(GameAladdin.class).get(0);
        aladdin.addNewLife();
    }

    public void removefromWorld(){
        getWorld().removeObject(this);
    }
    public void randomTurn()
    {
        if(Greenfoot.getRandomNumber (100)<10)
            turn(Greenfoot.getRandomNumber(40)-20);
    }
     /**
     * if we reach at edge of the world turn little bit
     */   
    public void turnAtEdge()
    {
       if(isAtEdge())
       turn(3);
    }
}
