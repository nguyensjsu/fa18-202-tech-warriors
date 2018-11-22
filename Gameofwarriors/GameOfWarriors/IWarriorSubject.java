
public interface IWarriorSubject {
	
	    /**
	     * Add Observer to Subscribers List
	     * @param obj Observer Object
	     */
	    void attach( IWarriorObserver obj ) ;

	    /**
	     * Remove Observer from Subscription
	     * @param obj Observer Object
	     */
	    void removeObserver( IWarriorObserver obj ) ;

	    /**
	     * Trigger Events to Observers
	     */
	    void notifyObservers() ;
	

}
