import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HelpWorld extends World 
{
    Aladdin aladdin = new Aladdin();
    //private BackOption backOption ;
    //private BackCommand backCmd ;
    //Start Sound
    GreenfootSound background;
    private BackOption backOption ;
    private BackCommand backCmd ;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public HelpWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1153, 800, 1);
        addObject(aladdin,1045, 588);
        addObject(new Princess(),115, 594);
        addObject(new LeftArrow(),100, 50);
        addObject(new RightArrow(),100, 135);
        addObject(new LeftArrowText(),400, 50);
        addObject(new RightArrowText(),400, 135);
        backOption  = new BackOption("Back") ;
        backCmd = new BackCommand();
        addObject(backOption,600,650);
        backOption.setCommand(backCmd);
        backCmd.setReceiver(
                new IMenuReceiver() {
                    /** Command Action */
                    public void doAction() {
                        if(Greenfoot.mouseClicked(backOption)){
                            World gameMenuWorld = new GameMenuWorld();
                            Greenfoot.setWorld(gameMenuWorld);
                        }
                    }
              }
              ) ;
    }

}
