import greenfoot.*;
/**
 * Chain of responsibility pattern
 * Handles Collect Jewels sound event
 * 
 * @author Priyanka.Singhal
 * @version V1.0
 */
public class CollectJewelsSoundEventHandler implements IEventSoundHandler 
{
    IEventSoundHandler chain;
    GreenfootSound collectjewels = new GreenfootSound("collectjewels.wav");
    GreenfootSound collectlifeline = new GreenfootSound("collectlifeline.wav");
   /**
     * Handles sound event for various actions
     * @param event action
     */
    public void handleSoundEvent(String action){
        
        if(action.equalsIgnoreCase(ActionEnum.COLLECTJEWELS.toString())){
            collectjewels.play();
            
        }else if(action.equalsIgnoreCase(ActionEnum.COLLECTLIFELINE.toString())){
            collectlifeline.play();
            
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
