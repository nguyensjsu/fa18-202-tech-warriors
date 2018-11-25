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
    private int accelaration = 2;
    private int jumpStrength=7;
    GreenfootImage myImage = null;
    int remainingLife = 0;
    int jewelsCollected = 0;
    public int lifeCount = 3;
    private String scoreState;
    private ArrayList<IScoreObserver> scoreObserver = new ArrayList<IScoreObserver>() ;
    private ArrayList<LifeCount> lives = new ArrayList<LifeCount>() ;
    public String marioState ;
    
    
    
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
        if(getOneIntersectingObject(Enemies.class)!= null){
            Greenfoot.stop();    
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
        move(3);     
        setImage(myImage);
    }
    public void moveLeft()
    {
        move(-3);  
        setImage("alladinwidsordleft.png");
    } 
    public void fall()
    {
        setLocation(getX(), getY()+fallSpeed);
        fallSpeed = fallSpeed+accelaration;
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
        
    }
    public void setMarioState(String marioStatus)
    {
        marioState = marioStatus;
    }
    public String getMarioState(){
        return marioState;
    }
    /**
     * Add Observer to Subscribers List
     * @param obj LifeCount Object
     */
    public void attach( LifeCount obj ) 
    {
        lives.add(obj);
    }
    
    /**
     * Remove Observer from Subscription
     * @param obj LifeCount Object
     */
    public void removeObserver( LifeCount obj ) {
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
     

    
}
