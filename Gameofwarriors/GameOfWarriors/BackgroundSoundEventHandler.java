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
    static GreenfootSound sound = new GreenfootSound("background.mp3");
   /**
     * Handles sound event for various actions
     * @param event action
     */
    public void handleSoundEvent(String action){
       
       if(action.equalsIgnoreCase("stop")){
           sound.stop();
       }  
        else if(action.equalsIgnoreCase(ActionEnum.BACKGROUND.toString())){
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
