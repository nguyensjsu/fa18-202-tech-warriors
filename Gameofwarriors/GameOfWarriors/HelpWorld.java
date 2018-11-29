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
        //backOption  = new BackOption("Back to Main Menu") ;
        //backCmd = new BackCommand();
        /*addObject(backOption,150,100);
        backOption.setCommand(backCmd);
        backCmd.setReceiver(
                new IMenuReceiver() {
                    /** Command Action */
                    /*public void doAction() {
                        if(Greenfoot.mouseClicked(backOption)){
                            World gameMenuWorld = new GameMenuWorld();
                            Greenfoot.setWorld(gameMenuWorld);
                        }
                    }
              }
              ) ;*/
    }

}
