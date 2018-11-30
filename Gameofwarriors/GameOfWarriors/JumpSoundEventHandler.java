import greenfoot.*;
/**
 * Chain of responsibility pattern
 * Handles jump sound event
 * 
 * @author Priyanka.Singhal
 * @version V1.0
 */
public class JumpSoundEventHandler implements IEventSoundHandler 
{
    IEventSoundHandler chain;
   /**
     * Handles sound event for various actions
     * @param event action
     */
    public void handleSoundEvent(String action){
        
        if(action.equalsIgnoreCase(ActionEnum.JUMP.toString())){
            GreenfootSound sound = new GreenfootSound("jump.wav");
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
