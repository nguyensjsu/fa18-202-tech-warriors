import greenfoot.*;
/**
 * Chain of responsibility pattern
 * Handles Collect Coin sound event
 * 
 * @Priyanka.Singhal
 * @V1.0
 */
public class CollectCoinEventHandler implements IEventSoundHandler 
{
    IEventSoundHandler chain;
   /**
     * Handles sound event for various actions
     * @param event action
     */
    public void handleSoundEvent(String action){
        
        if(action.equalsIgnoreCase(ActionEnum.COLLECTCOINS.toString())){
            Greenfoot.playSound("collect.wav");
            
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
