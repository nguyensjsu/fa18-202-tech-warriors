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
    private int level_num;
    public Score(GameAladdin subject, int x)
    {
        level_num = x;
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
    public void addScoreForJewel()
    {
        if(jewelName == "GreenJewel")
            totalScore = totalScore+20;
        else if (jewelName == "PinkJewel")
            totalScore = totalScore+10;
        else if (jewelName == "BlueJewel")
            totalScore = totalScore+5;
        eventUpdate();
    }
    public void updateScore()
    {
        if(level_num == 0){
           PalaceWorld palace =(PalaceWorld)getWorld();
           jewelName = palace.aladdin.getScoreState();
        
           if(jewelName == "PinkJewel" || jewelName == "BlueJewel" || jewelName == "GreenJewel")
              addScoreForJewel();
        }
        else if(level_num == 1){
           PalaceWorld2 palace =(PalaceWorld2)getWorld();
           jewelName = palace.aladdin.getScoreState();
        
           if(jewelName == "PinkJewel" || jewelName == "BlueJewel" ||  jewelName == "GreenJewel")
              addScoreForJewel();            
        }
    
    }
    public void setlevel(int x){
        level_num = x;
    } 
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
