/**
 * Chain of responsibility pattern
 * Handles sound on different events 
 * 
 * @Priyanka.Singhal
 * @V1.0
 */
public interface IEventSoundHandler  
{
    /**
     * Handles sound event for various actions
     * @param event action
     */
    void handleSoundEvent(String action);
    /**
     * Sets the chain of responsibility to different handler
     * @param next sound handler
     */
    void setNext( IEventSoundHandler next) ;
}
