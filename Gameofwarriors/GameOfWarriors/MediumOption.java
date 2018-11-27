import greenfoot.*;
public class MediumOption extends GameLevels implements IMenuInvoker {
    
    private IMenuCommand cmd ;
    
    public MediumOption(String level)
    {
        super(level);
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()/6;
        int myNewWidth = (int)myImage.getWidth()/6;
        myImage.scale(myNewWidth,myNewHeight);
    }

    /**
     * Set Command for Menu Option
     * @param c [description]
     */
    public void setCommand( IMenuCommand c ) {
        cmd = c ;
    }

    /** Invoke Menu Option */
    public void invoke() 
    {
        cmd.execute() ;
    }

}
