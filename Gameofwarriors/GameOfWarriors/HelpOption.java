import greenfoot.*;
public class HelpOption extends Options implements IMenuInvoker {
    
    private IMenuCommand cmd ;
    
    public HelpOption(String option)
    {
        super(option);
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight();
        int myNewWidth = (int)myImage.getWidth()*3/2;
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
