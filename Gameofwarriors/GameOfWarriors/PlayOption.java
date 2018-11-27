import greenfoot.*;
public class PlayOption extends Options implements IMenuInvoker {
    
    private IMenuCommand cmd ;
    
    public PlayOption(String option)
    {
        super(option);
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight();
        int myNewWidth = (int)myImage.getWidth();
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
