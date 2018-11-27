import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PalaceWorld2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PalaceWorld2 extends World
{

    PalaceWorld prev_world;
    GameAladdin aladdin;
    LifeCount lifeimg1;
    LifeCount lifeimg2;
    LifeCount lifeimg3;
    Life life1;
    Score score;
    JewelsCollected jewelCollection;
    Level level;
    int jewelsonscreen;
    int level_num;
    //Start Sound
    GreenfootSound startSound;

    /**
     * Constructor for objects of class PalaceWorld2.
     * 
     */
    public PalaceWorld2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1153, 800, 1);
        prev_world = null;
        aladdin= new GameAladdin();
        level_num = 1;
        //jewel1 = new PinkJewel(level_num);//for score board
        lifeimg1 = new LifeCount();
        lifeimg2 = new LifeCount();
        lifeimg3 = new LifeCount();
        life1 = new MovingLife();
        score = new Score(aladdin, level_num);
        jewelCollection= new JewelsCollected(aladdin);
        level = new Level(this);
        jewelsonscreen = 14;
        startup();
    }

    /**
     * Constructor for objects of class PalaceWorld2.
     * 
     */
    public PalaceWorld2(PalaceWorld world)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1153, 800, 1);
        level_num = 1;
        prev_world = world;
        aladdin = prev_world.aladdin;
        //jewel1 = prev_world.jewel1;
        lifeimg1 = prev_world.lifeimg1;
        lifeimg2 = prev_world.lifeimg2;
        lifeimg3 = prev_world.lifeimg3;
        life1 = prev_world.life1;
        score = prev_world.score;
        jewelCollection = prev_world.jewelCollection;
        level = prev_world.level;
        startup();
    }

    public void startup()
    {
        addObject(aladdin, 94,737);
        addObject(life1, 652, 433);//moving life for collection
        //score board
        //addObject(jewel1, 30, 25);
        addObject(jewelCollection, 60,25);
        addObject(lifeimg1, 90, 25);
        addObject(lifeimg2, 120, 25);
        addObject(lifeimg3, 150, 26);

        addObject(score,270,26); 

        aladdin.attach(score);//attach game actor to update on score.     
        aladdin.attach(jewelCollection);//attach game actor to update on score.
        populate();
        aladdin.attachLifeObserver(lifeimg1);//attach game actor to update on score.        
    }

    public void populate()
    {
        for(int i = 0 ; i< 7 ; i++)
        {
            //addObject(new BlueJewel(level_num), Greenfoot.getRandomNumber (1100),Greenfoot.getRandomNumber (700));
            //addObject(new PinkJewel(level_num), Greenfoot.getRandomNumber (1100),Greenfoot.getRandomNumber (700));
            
        }        
    }

    public void decrease_jewels()
    {
        if(jewelsonscreen > 0)
            jewelsonscreen--;
        if(jewelsonscreen == 0){
           
        }
    }
}
