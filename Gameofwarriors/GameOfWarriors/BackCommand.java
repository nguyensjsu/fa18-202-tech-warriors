/**
 * Write a description of class PlayCommand here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BackCommand  implements IMenuCommand
{

    IMenuReceiver target ;
    
    /** Execute Command */
    public void execute() 
    {
        target.doAction() ;
    }
    
    /**
     * Set Receiver of Command
     * @param t Target Receiver
     */
    public void setReceiver( IMenuReceiver t ) 
    {
        target = t ;
    }

}
