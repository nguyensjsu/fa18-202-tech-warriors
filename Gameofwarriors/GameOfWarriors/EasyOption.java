import greenfoot.*;
public class EasyOption extends GameLevels implements IMenuInvoker {
    
    private IMenuCommand cmd ;
    
    public EasyOption(String level)
    {
        super(level);
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()*3/2;
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
