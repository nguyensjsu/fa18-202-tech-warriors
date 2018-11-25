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
    Enemies e =new Enemies();
    GameAladdin aladdin= new GameAladdin();
    JumpBar jumpbar = new JumpBar();
    JumpBar jumpbar1 = new JumpBar();
    JumpBar jumpbar2 = new JumpBar();
    JumpBar jumpbar3 = new JumpBar();
    JumpBar jumpbar4 = new JumpBar();
    Jewel1 jewel1 = new Jewel1();
    Jewel1 jewel2 = new Jewel1();
    LifeCount lifeimg1 = new LifeCount();
    LifeCount lifeimg2 = new LifeCount();
    LifeCount lifeimg3 = new LifeCount();
    Life life1 = new MovingLife();
    Score score = new Score(aladdin);
    JewelsCollected jc= new JewelsCollected(aladdin);
    
 
    private List<JewelsCollection> jewels = new ArrayList<JewelsCollection>();//jewels list
    public List<JewelsCollection> getJewels()
    {
        return jewels;
    }

    /**
     * Constructor for objects of class PalaceWorld.
     * 
     */
    public PalaceWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 750, 1);
        addObject(jumpbar, 300, 600);
        addObject(jumpbar1, 640, 500);
        addObject(jumpbar2, 410, 340);
        addObject(jumpbar3, 540, 140);
        addObject(jumpbar4, 880, 300);
        addObject(aladdin, 117,736);
        addObject(e, 413, 518);
        addObject(jewel1, 91, 26);
        addObject(lifeimg1, 160, 26);
        addObject(lifeimg2, 190, 26);
        //addObject(lifeimg3, 220, 26);
        //addObject(jewel2, 652, 433);
        addObject(life1, 652, 433);
        addObject(score,330,22); //Add mario
        aladdin.attach(score);//attach game actor to update on score.
        addObject(jc, 127,23);
        aladdin.attach(jc);//attach game actor to update on score.
        addObject(new Jewel1(), 753,462);
        addObject(new Jewel1(), 900,150);
        addObject(new Jewel1(), 270,380);
        aladdin.attachLifeObserver(lifeimg1);//attach game actor to update on score.
    }
}
