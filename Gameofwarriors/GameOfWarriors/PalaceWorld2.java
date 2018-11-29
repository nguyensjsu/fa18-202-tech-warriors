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
    AbstractFactory enFactory = FactoryProducer.getFactory("ENEMY") ;
    AbstractFactory jFactory = FactoryProducer.getFactory("JEWEL") ;    
    //Start Sound
    GreenfootSound startSound;
    Jewel jewel1;//for score board

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
        jewel1 = new PinkJewel(level_num);//for score board
        lifeimg1 = new LifeCount();
        lifeimg2 = new LifeCount();
        lifeimg3 = new LifeCount();
        //set lifecount to PalaceWorld2
        lifeimg1.setLifeWorld(level_num);
        lifeimg2.setLifeWorld(level_num);
        lifeimg3.setLifeWorld(level_num);
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
    public PalaceWorld2(PalaceWorld world, GameAladdin aladdin, LifeCount x, LifeCount y, LifeCount z, Life life1, Score score, JewelsCollected jewelCollection, Level level)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1153, 800, 1);
        level_num = 1;
        this.aladdin = aladdin;
        jewel1 = new PinkJewel(level_num);//for score board
        lifeimg1 = x;
        lifeimg2 = y;
        lifeimg3 = z;
        //set lifecount to PalaceWorld2
        lifeimg1.setLifeWorld(level_num);
        lifeimg2.setLifeWorld(level_num);
        lifeimg3.setLifeWorld(level_num);
        this.life1 = life1;
        this.score = score;
        this.jewelCollection = jewelCollection;
        this.level = level;
        level.setLevel(level_num, this);
        startup();
    }

    public void startup()
    {
        addObject(aladdin, 94,737);
        //addObject(life1, 652, 433);//moving life for collection
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
    }

    public void populate()
    {
        addObject((Enemies)enFactory.getEnemy("ENEMY1", 437), 437, 500);
        addObject((Enemies)enFactory.getEnemy("ENEMY1", 665), 665, 415);
        addObject((Enemies)enFactory.getEnemy("ENEMY1", 882), 882, 240);
        for(int i = 0 ; i< 7 ; i++)
        {
            addObject((Jewel)jFactory.getJewel("BLUE", level_num), Greenfoot.getRandomNumber (1100),Greenfoot.getRandomNumber (700));
            //addObject((Jewel)jFactory.getJewel("GREEN", level_num), Greenfoot.getRandomNumber (1100),Greenfoot.getRandomNumber (700));
            addObject((Jewel)jFactory.getJewel("PINK", level_num), Greenfoot.getRandomNumber (1100),Greenfoot.getRandomNumber (700));
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
