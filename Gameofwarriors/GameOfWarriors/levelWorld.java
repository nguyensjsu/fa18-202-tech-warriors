import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class levelWorld extends World 
{
    Aladdin aladdin = new Aladdin();
    private EasyOption easyOption ;
    private MediumOption mediumOption ;
    private EasyOptionCmd easyCmd ;
    private MediumOptionCmd mediumCmd ;
    //Start Sound
    GreenfootSound background;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public levelWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1100, 800, 1);
        //addObject(aladdin,1050, 600);
        easyOption  = new EasyOption("Easy") ;
        mediumOption  = new MediumOption("Medium") ;
        easyCmd = new EasyOptionCmd();
        addObject(easyOption,570,420);
        mediumCmd = new MediumOptionCmd();
        addObject(mediumOption,570,530);
        easyOption.setCommand(easyCmd);
        easyCmd.setReceiver(
                new IMenuReceiver() {
                    /** Command Action */
                    public void doAction() {
                        if(Greenfoot.mouseClicked(easyOption)){
                            World palaceWorld = new PalaceWorld();
                            Greenfoot.setWorld(palaceWorld);
                        }
                    }
              }
              ) ; 
        mediumOption.setCommand(mediumCmd);      
        mediumCmd.setReceiver(
                new IMenuReceiver() {
                    /** Command Action */
                    public void doAction() {
                        if(Greenfoot.mouseClicked(mediumOption)){
                            World palaceWorld2 = new PalaceWorld2();
                            Greenfoot.setWorld(palaceWorld2);
                        }
                    }
              }
              ) ;  
        //Game background sound
        //background = new GreenfootSound("background.mp3");
        //background.playLoop();
    }

}
