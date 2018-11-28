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
        addObject(aladdin, 94,737);//add aladdin obj to world
        //adding jumpbar to the world
        addObject(new JumpBar(), 300, 600);
        addObject(new JumpBar(), 640, 500);
        addObject(new JumpBar(), 410, 340);
        addObject(new JumpBar(), 540, 140);
        addObject(new JumpBar(), 880, 300);
        addObject(new JumpBar(), 950, 620);
        //add enemies
        addObject((Enemies)enFactory.getEnemy("ENEMY1" , 365), 365, 540);
        addObject((Enemies)enFactory.getEnemy("ENEMY1", 1005), 1005, 558);
        addObject((Enemies)enFactory.getEnemy("ENEMY2", 600), 600, 80);
        addObject((Enemies)enFactory.getEnemy("ENEMY2", 470), 470, 280);
        addObject((Enemies)enFactory.getEnemy("ENEMY2", 700), 700, 442);
        addObject((Enemies)enFactory.getEnemy("ENEMY1", 940), 940, 240);
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
        populate();
        aladdin.attachLifeObserver(lifeimg1);//attach game actor to update on score.
        level.displayLevel();
  
        //update_jewel_count();
        //Game start sound
        //startSound = new GreenfootSound("startgame.mp3");
        //startSound.playLoop();
    }

    /*public void update_jewel_count()
    {
        GreenfootImage image = getBackground();
        image.setColor(Color.WHITE);
        image.setFont(new Font("Trebuchet MS", true, true, 20));
        image.drawString("Jewels: " +jewelsonscreen, 400, 25);
    }*/

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
        //level.setLevel();
        //level.displayLevel();
    }

    public void populate()
    {
        for(int i = 0 ; i< 7 ; i++)
        {
            //addObject(new BlueJewel(level_num), Greenfoot.getRandomNumber (1100),Greenfoot.getRandomNumber (700));
            //addObject(new PinkJewel(level_num), Greenfoot.getRandomNumber (1100),Greenfoot.getRandomNumber (700));
            addObject((Jewel)jFactory.getJewel("BLUE"), Greenfoot.getRandomNumber (1100),Greenfoot.getRandomNumber (700));
            //addObject((Jewel)jFactory.getJewel("GREEN"), Greenfoot.getRandomNumber (1100),Greenfoot.getRandomNumber (700));
            addObject((Jewel)jFactory.getJewel("PINK"), Greenfoot.getRandomNumber (1100),Greenfoot.getRandomNumber (700));            
        }
        
    }
}
