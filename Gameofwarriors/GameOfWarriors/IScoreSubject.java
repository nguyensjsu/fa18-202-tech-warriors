
public interface IScoreSubject {
	
	    /**
	     * Add Observer to Subscribers List
	     * @param obj Observer Object
	     */
	    void attach( IScoreObserver obj ) ;

	    /**
	     * Remove Observer from Subscription
	     * @param obj Observer Object
	     */
	    void removeObserver( IScoreObserver obj ) ;

	    /**
	     * Trigger Events to Observers
	     */
	    void notifyObservers() ;
	

}
