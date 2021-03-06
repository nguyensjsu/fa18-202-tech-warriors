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
    int level_num = 0; 
    Jewel jewel1 = new PinkJewel(/*level_num*/);//for score board
    //display life count on screen
    LifeCount lifeimg1 = new LifeCount();
    LifeCount lifeimg2 = new LifeCount();
    LifeCount lifeimg3 = new LifeCount();
    //extra life for aladdin
    Life life1 = new MovingLife();
    Score score = new Score(aladdin, level_num);
    JewelsCollected jewelCollection= new JewelsCollected(aladdin);   
    Level level = new Level(this);
    int jewelsonscreen = 14;
    AbstractFactory enFactory = FactoryProducer.getFactory("ENEMY") ;
    AbstractFactory jFactory = FactoryProducer.getFactory("JEWEL") ;
    
    //Start Sound
    GreenfootSound startSound;
    /**
     * Constructor for objects of class PalaceWorld.
     * 
     */
    public PalaceWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1153, 800, 1);
        addObject(aladdin, 94,710);//add aladdin obj to world
        //set lifecount to PalaceWorld
        lifeimg1.setLifeWorld(level_num);
        lifeimg2.setLifeWorld(level_num);
        lifeimg3.setLifeWorld(level_num);
        //add enemies
        addObject((Enemies)enFactory.getEnemy("ENEMY1" , 420), 420, 540);
        addObject((Enemies)enFactory.getEnemy("ENEMY1", 955), 955, 560);
        addObject((Enemies)enFactory.getEnemy("ENEMY2", 600), 600, 85);
        addObject((Enemies)enFactory.getEnemy("ENEMY2", 470), 470, 245);
        //addObject((Enemies)enFactory.getEnemy("ENEMY2", 700), 700, 442);
        addObject((Enemies)enFactory.getEnemy("ENEMY1", 940), 940, 240);
        addObject(life1, 652, 433);//moving life for collection
        //score board
        addObject(jewel1, 30, 25);
        addObject(jewelCollection, 60,25);
        addObject(lifeimg1, 90, 25);
        addObject(lifeimg2, 120, 25);
        addObject(lifeimg3, 150, 26);
        //score 
        addObject(score,270,26); 
        aladdin.attach(score);//attach game actor to update on score.     
        aladdin.attach(jewelCollection);//attach game actor to update on score.
        populate();
        aladdin.attachLifeObserver(lifeimg1);//attach game actor to update on score.
        level.displayLevel();

        //add moving jumpbar to the world
        addObject(new MovingJumpBar(300), 300, 450);
        //addObject(new MovingJumpBar(250), 250, 240);
        addObject(new MovingJumpBar(1050), 1050, 130);
        addObject(new BottomBar() ,650, 790);
        //update_jewel_count();

        //Game start sound
        //startSound = new GreenfootSound("startgame.mp3");
        //startSound.playLoop();
    }

    public void decrease_jewels()
    {
        if(jewelsonscreen > 0)
            jewelsonscreen--;
        if(jewelsonscreen == 0){
           //jewel1.setlevel(1);
           score.setlevel(1);
           nextLevel();
        }
    }

    public void nextLevel()
    {
        level_num++;
        World palaceWorld2 = new PalaceWorld2(this, aladdin, lifeimg1, lifeimg2, lifeimg3, life1, score, jewelCollection, level);
        Greenfoot.setWorld(palaceWorld2);
    }

    public void populate()
    {
        for(int i = 0 ; i< 7 ; i++)
        {
            addObject((Jewel)jFactory.getJewel("BLUE", level_num), Greenfoot.getRandomNumber (1100) + 30,Greenfoot.getRandomNumber (700) + 50);
            addObject((Jewel)jFactory.getJewel("GREEN", level_num), Greenfoot.getRandomNumber (1100) + 30,Greenfoot.getRandomNumber (700) + 50);
            addObject((Jewel)jFactory.getJewel("PINK", level_num), Greenfoot.getRandomNumber (1100) + 30,Greenfoot.getRandomNumber (700) + 50);            
        }
        
    }
}
