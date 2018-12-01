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
    private int accelaration = 1;
    private boolean gameStart = true;
    private int jumpStrength=20;
    GreenfootImage myImage = null;
    int remainingLife = 0;
    int jewelsCollected = 0;
    //public int lifeCount = 3;
    private String scoreState;
    private ArrayList<IScoreObserver> scoreObserver = new ArrayList<IScoreObserver>() ;
    private ArrayList<LifeCount> lives = new ArrayList<LifeCount>() ;
    public String aladdinState ;
    //Sound Event
    private EventSoundClient client = new EventSoundClient();
    public GameAladdin()
    {
        myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()/4;
        int myNewWidth = (int)myImage.getWidth()/4;
        myImage.scale(myNewWidth,myNewHeight);// Add your action code here.
        client.handleSoundEvent("background");
    }
    /**
     * Act - do whatever the GameAladdin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(getOneIntersectingObject(Enemies.class)!= null){
             //Sound Event
            client.handleSoundEvent("hitenemy");
            setLocation(94,710);
            die();  
        }

        checkKeys();
        fall();
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
         if(Greenfoot.isKeyDown("space") && onFlatGround())
         {
            //Sound Event
            client.handleSoundEvent("jump");
            jump();
         }
    }
    public boolean onFlatGround()
    {
        /*Actor fallObj = getOneObjectAtOffset(0, this.getImage().getHeight()/2, JumpBar.class);
        return fallObj!=null;*/

        boolean onFlatGround = false;
        if(getY() > 710){
           onFlatGround = true;
        }
        int imagewidth = getImage().getWidth();
        int imageheight = getImage().getHeight();
        if(getOneObjectAtOffset(imagewidth/-2, imageheight/2, JumpBar.class) != null
            || getOneObjectAtOffset(imagewidth/2, imageheight/2, JumpBar.class) != null)
            onFlatGround = true;
        return onFlatGround;       
    }
    public boolean bumpHead()
    {
        /*Actor fallObj = getOneObjectAtOffset(0, this.getImage().getHeight()/2, JumpBar.class);
        return fallObj!=null;*/

        boolean bumpHead = false;
        int imagewidth = getImage().getWidth();
        int imageheight = getImage().getHeight();
        if(getOneObjectAtOffset(imagewidth/-2, imageheight/-2, JumpBar.class) != null
            || getOneObjectAtOffset(imagewidth/2, imageheight/-2, JumpBar.class) != null)
            bumpHead = true;
        return bumpHead;       
    }
    public void moveRight()
    {
        move(5);
        //prevent aladdin from going outside of world
        if(getX() > getWorld().getWidth() - getImage().getWidth())
           setLocation(getWorld().getWidth() - getImage().getWidth(), getY());     
        setImage(myImage);
    }
    public void moveLeft()
    {
        move(-5);
        //prevent aladdin from going outside of world
        if(getX() < getImage().getWidth())
           setLocation(getImage().getWidth(), getY());  
        setImage("alladinwidsordleft.png");
    } 
    public void fall()
    {
        /*fallSpeed = fallSpeed+accelaration;
        //prevent aladdin from going outside of world
        if(getY()+fallSpeed > 710)
           setLocation(getX(),710);
        else if(getY()+fallSpeed < getImage().getHeight())
           setLocation(getX(),getImage().getHeight());
        else
           setLocation(getX(), getY()+fallSpeed);*/
        setLocation(getX(), getY() + fallSpeed);
        if(onFlatGround()) {
           fallSpeed = 0;
        }
        else if(bumpHead() && fallSpeed < 0) fallSpeed = 0;
        else fallSpeed += accelaration;
    }
    /*public void checkFall()
    {
        if(onJumpBar())
            fallSpeed=0;
        else
            fall();
    }*/
    public void jump()
    {
        /*fallSpeed = -jumpStrength;
        fall();*/
        fallSpeed = -jumpStrength;
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
    public void setAladdinState(String alladinStatus)
    {
        aladdinState = alladinStatus;
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
