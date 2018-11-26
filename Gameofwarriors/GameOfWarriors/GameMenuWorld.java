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
    private Level level ;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public GameMenuWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1153, 800, 1);
        level = new Level();
        addObject(aladdin,1050, 600);
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
                            World palaceWorld = new PalaceWorld();
                            Greenfoot.setWorld(palaceWorld);
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
    }

}
