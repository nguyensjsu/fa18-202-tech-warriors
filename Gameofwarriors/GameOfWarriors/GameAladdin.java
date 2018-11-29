import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.util.ArrayList;
/**
 * Write a description of class GameAladdin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameAladdin extends Actor implements IScoreSubject
{
 
    private int fallSpeed = 0;
    private int accelaration = 5;
    private boolean gameStart = true;
    private int jumpStrength=12;
    GreenfootImage myImage = null;
    int remainingLife = 0;
    int jewelsCollected = 0;
    //public int lifeCount = 3;
    private String scoreState;
    private ArrayList<IScoreObserver> scoreObserver = new ArrayList<IScoreObserver>() ;
    private ArrayList<LifeCount> lives = new ArrayList<LifeCount>() ;
    public String aladdinState ;
    public GameAladdin()
    {
        myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()/4;
        int myNewWidth = (int)myImage.getWidth()/4;
        myImage.scale(myNewWidth,myNewHeight);// Add your action code here.
    }
    /**
     * Act - do whatever the GameAladdin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        /*if(getOneObjectAtOffset(0,0,Enemies.class)!= null){
            die();
            //Greenfoot.stop();    
        }*/
        if(getOneIntersectingObject(Enemies.class)!= null){
            setLocation(94,710);
            die();
            //Greenfoot.stop();    
        }

        checkKeys();
        checkFall();
    }    
    public void checkKeys()
    {
         if(Greenfoot.isKeyDown("right"))
         {
             moveRight();
         }
         if(Greenfoot.isKeyDown("left"))
         {
             moveLeft();
         }
         if(Greenfoot.isKeyDown("space"))
         {
             jump();
         }
    }
    public boolean onJumpBar()
    {
        Actor fallObj = getOneObjectAtOffset(0, this.getImage().getHeight()/2, JumpBar.class);
        return fallObj!=null;       
    }
    public void moveRight()
    {     
        move(5);     
        setImage(myImage);
    }
    public void moveLeft()
    {
        move(-5);  
        setImage("alladinwidsordleft.png");
    } 
    public void fall()
    {
        

        if(gameStart)
        {
            setLocation(getX(), getY());
            gameStart = false;
            
        }
        else
        {
            
            fallSpeed = fallSpeed+accelaration;
            setLocation(getX(), getY()+fallSpeed);
        }
    }
    public void checkFall()
    {
        if(onJumpBar())
            fallSpeed=0;
        else
            fall();
    }
    public void jump()
    {
        fallSpeed = -jumpStrength;
        fall();
    }
        /**
     * Add Observer to Subscribers List
     * @param obj Observer Object
     */
    public void attach( IScoreObserver obj ) 
    {
        scoreObserver.add(obj);
    }
    
    /**
     * Remove Observer from Subscription
     * @param obj Observer Object
     */
    public void removeObserver( IScoreObserver obj ) {
        scoreObserver.remove(obj);
    }
    
    /**
     * Trigger Events to Observers
     */
    public void notifyObservers() {
        for (IScoreObserver obj  : scoreObserver)
        {
            obj.updateScore();
        }
    }
    public void setScoreState(String jewelType)
    {
        scoreState= jewelType;
        notifyObservers();
    
    }
    public String getScoreState()
    {
        return scoreState;
    }
    public void addNewLife()
    {
        setAladdinState("gotLife");
        
    }
    public void setAladdinState(String marioStatus)
    {
        aladdinState = marioStatus;
        notifyLifeObservers();
        
    }
    public String getAladdinState(){
        return aladdinState;
    }
    /**
     * Add Observer to Subscribers List
     * @param obj LifeCount Object
     */
    public void attachLifeObserver( LifeCount obj ) 
    {
        lives.add(obj);
    }
    
    /**
     * Remove Observer from Subscription
     * @param obj LifeCount Object
     */
    public void removeLifeObserver( LifeCount obj ) {
        lives.remove(obj);
    }
    /**
     * Trigger Events to Observers
     */
    public void notifyLifeObservers() {
        for (LifeCount obj  : lives)
        {        
            obj.updateLife();
        }
    }
    public void die()
    {  
        setAladdinState("dead");
    }
     

    
}
