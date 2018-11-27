import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameMenuWorld extends World 
{
    Aladdin aladdin = new Aladdin();
    private PlayOption playOption ;
    private HelpOption helpOption ;
    private PlayCommand playCmd ;
    private HelpCommand helpCmd ;
    //Start Sound
    GreenfootSound background;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public GameMenuWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1153, 800, 1);
        addObject(aladdin,1045, 588);
        addObject(new Princess(),115, 594);
        playOption  = new PlayOption("Play") ;
        helpOption  = new HelpOption("Help") ;
        playCmd = new PlayCommand();
        addObject(playOption,100,100);
        helpCmd = new HelpCommand();
        addObject(helpOption,100,300);
        playOption.setCommand(playCmd);
        playCmd.setReceiver(
                new IMenuReceiver() {
                    /** Command Action */
                    public void doAction() {
                        if(Greenfoot.mouseClicked(playOption)){
                            World levelworld = new levelWorld();
                            Greenfoot.setWorld(levelworld);
                        }
                    }
              }
              ) ; 
        helpOption.setCommand(helpCmd);      
        helpCmd.setReceiver(
                new IMenuReceiver() {
                    /** Command Action */
                    public void doAction() {
                        if(Greenfoot.mouseClicked(helpOption)){
                            World helpWorld = new HelpWorld();
                            Greenfoot.setWorld(helpWorld);
                        }
                    }
              }
              ) ;  
        //Game background sound
        //background = new GreenfootSound("background.mp3");
        //background.playLoop();
    }

}
