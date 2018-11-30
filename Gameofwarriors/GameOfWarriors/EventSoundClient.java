/**
 * Sets a chain of sound handlers
 * 
 * @author priyanka.singhal 
 * @version v1.0
 */
public class EventSoundClient  
{
    private IEventSoundHandler background =  new BackgroundSoundEventHandler();
    private IEventSoundHandler jump =  new JumpSoundEventHandler();
    private IEventSoundHandler hitEnemy =  new HitEnemySoundEventHandler();
    private IEventSoundHandler collectJewels =  new CollectJewelsSoundEventHandler();
    private IEventSoundHandler gameOverOrWon =  new GameOverOrWonSoundEventHandler();
    
    /**
     * Sets a chain of sound handlers
     */
    public EventSoundClient()
    {
         background.setNext(jump);
         jump.setNext(hitEnemy);
         hitEnemy.setNext(collectJewels);
         collectJewels.setNext(gameOverOrWon);
         
    }

   /**
     * Handles sound event for various actions
     * @param event action
     */
   public void handleSoundEvent(String action)
   {
       background.handleSoundEvent(action);
    }
}
