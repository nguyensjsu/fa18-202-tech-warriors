import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Score extends Actor implements IScoreObserver
{
    private int totalScore = 0;
    private String jewelName;
    private GameAladdin alladin;
    public Score(GameAladdin subject)
    {
        alladin = subject;
        setImage(new GreenfootImage(200,30));
        eventUpdate();
    }
    /**
     * Act - do whatever the Score wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }  
    public void  eventUpdate()
    {
        GreenfootImage image = getImage();
        image.clear();
        image.setColor(Color.WHITE);
        image.setFont(new Font("Trebuchet MS",true, false, 20));
        image.drawString("Score: "+ totalScore, 5, 20);
       
    }
    public void addScoreForJewel1()
    {
        totalScore = totalScore+5;
        eventUpdate();
    }
    public void updateScore()
    {
        PalaceWorld palace =(PalaceWorld)getWorld();
        jewelName = palace.aladdin.getScoreState();
        if(jewelName =="Jewel1")
            addScoreForJewel1();
    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
