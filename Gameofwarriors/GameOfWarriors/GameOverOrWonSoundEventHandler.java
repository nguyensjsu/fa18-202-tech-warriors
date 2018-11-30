import greenfoot.*;
/**
 * Chain of responsibility pattern
 * Handles gameover or won sound event
 * 
 * @author Priyanka.Singhal
 * @version V1.0
 */
public class GameOverOrWonSoundEventHandler implements IEventSoundHandler 
{
    IEventSoundHandler chain;
    GreenfootSound gameover = new GreenfootSound("gameover.wav");
    GreenfootSound win = new GreenfootSound("won.wav");
   /**
     * Handles sound event for various actions
     * @param event action
     */
    public void handleSoundEvent(String action){
        
        if(action.equalsIgnoreCase(ActionEnum.GAMEOVER.toString())){
           gameover.play();   
        }else if(action.equalsIgnoreCase(ActionEnum.WON.toString())){
            win.play();  
        }
        else{
            if(chain!=null){
                chain.handleSoundEvent(action);
            }   
            
        }    
    }
    /**
     * Sets the chain of responsibility to different handler
     * @param next sound handler
     */
    public void setNext( IEventSoundHandler next){
        this.chain = next;
        
    }    
}
