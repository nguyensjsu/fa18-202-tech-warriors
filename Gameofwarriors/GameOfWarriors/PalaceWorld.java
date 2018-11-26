import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.util.ArrayList;
/**
 * Write a description of class PalaceWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PalaceWorld extends World
{

    GameAladdin aladdin= new GameAladdin();
    Jewel1 jewel1 = new Jewel1();//for score board
    LifeCount lifeimg1 = new LifeCount();
    LifeCount lifeimg2 = new LifeCount();
    LifeCount lifeimg3 = new LifeCount();
    Life life1 = new MovingLife();
    Score score = new Score(aladdin);
    JewelsCollected jewelCollection= new JewelsCollected(aladdin);

    /**
     * Constructor for objects of class PalaceWorld.
     * 
     */
    public PalaceWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1153, 800, 1);
        addObject(new JumpBar(), 300, 600);
        addObject(new JumpBar(), 640, 500);
        addObject(new JumpBar(), 410, 340);
        addObject(new JumpBar(), 540, 140);
        addObject(new JumpBar(), 880, 300);
        addObject(aladdin, 94,737);
        addObject(new Enemies(), 345, 540);
        addObject(life1, 652, 433);//moving life for collection
        //score board
        addObject(jewel1, 30, 25);
        addObject(jewelCollection, 60,25);
        addObject(lifeimg1, 90, 25);
        addObject(lifeimg2, 120, 25);
        addObject(lifeimg3, 150, 26);
        
        addObject(score,270,26); 
        
        aladdin.attach(score);//attach game actor to update on score.     
        aladdin.attach(jewelCollection);//attach game actor to update on score.
        addObject(new Jewel1(), Greenfoot.getRandomNumber (1100),Greenfoot.getRandomNumber (700));
        addObject(new Jewel1(), Greenfoot.getRandomNumber (1100),Greenfoot.getRandomNumber (700));
        addObject(new Jewel1(), Greenfoot.getRandomNumber (1100),Greenfoot.getRandomNumber (700));
        addObject(new Jewel1(), Greenfoot.getRandomNumber (1100),Greenfoot.getRandomNumber (700));
        addObject(new Jewel1(), Greenfoot.getRandomNumber (1100),Greenfoot.getRandomNumber (700));
        addObject(new Jewel1(), Greenfoot.getRandomNumber (1100),Greenfoot.getRandomNumber (700));
        addObject(new Jewel1(), Greenfoot.getRandomNumber (1100),Greenfoot.getRandomNumber (700));
        addObject(new Jewel1(), Greenfoot.getRandomNumber (1100),Greenfoot.getRandomNumber (700));
        addObject(new Jewel1(), Greenfoot.getRandomNumber (1100),Greenfoot.getRandomNumber (700));
        addObject(new Jewel1(), Greenfoot.getRandomNumber (1100),Greenfoot.getRandomNumber (700));
        aladdin.attachLifeObserver(lifeimg1);//attach game actor to update on score.
    }
}
