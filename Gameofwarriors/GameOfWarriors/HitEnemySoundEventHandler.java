import greenfoot.*;
/**
 * Chain of responsibility pattern
 * Handles Hit enemy sound event
 * 
 * @Priyanka.Singhal
 * @V1.0
 */
public class HitEnemySoundEventHandler implements IEventSoundHandler 
{
    IEventSoundHandler chain;
   /**
     * Handles sound event for various actions
     * @param event action
     */
    public void handleSoundEvent(String action){
        
        if(action.equalsIgnoreCase(ActionEnum.HITENEMY.toString())){
           GreenfootSound sound = new GreenfootSound("hitenemy.wav");
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
