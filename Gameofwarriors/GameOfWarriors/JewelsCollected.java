import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Jewels here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class JewelsCollected extends Actor implements  IScoreObserver
{
    public int totalJewels = 0;
    protected GameAladdin alladin;
    public JewelsCollected(GameAladdin subject)
    {        
        alladin = subject;
        //setImage(new GreenfootImage(200,30));
        eventUpdate();
    }
    /**
     * Act - do whatever the Jewels wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }   
    public void updateScore()
    {
        totalJewels++;
        eventUpdate();
        
    }
    public void eventUpdate()
    {
        GreenfootImage image = getImage();
        image.clear();
        image.setColor(Color.WHITE);
        image.setFont(new Font("Trebuchet MS", true, true, 20));
        image.drawString(""+ totalJewels, 3, 15);
 
        
    }
    
}
