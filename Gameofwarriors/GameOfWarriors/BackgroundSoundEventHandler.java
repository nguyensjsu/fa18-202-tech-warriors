import greenfoot.*;
/**
 * Chain of responsibility pattern
 * Handles Background sound event
 * 
 * @author Priyanka.Singhal
 * @version V1.0
 */
public class BackgroundSoundEventHandler implements IEventSoundHandler 
{
    IEventSoundHandler chain;
   /**
     * Handles sound event for various actions
     * @param event action
     */
    public void handleSoundEvent(String action){
        
        if(action.equalsIgnoreCase(ActionEnum.BACKGROUND.toString())){
            GreenfootSound sound = new GreenfootSound("startgame.mp3");
            sound.setVolume(2);
            sound.play();
            
        }else{
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
