
public interface ISoundEventHandler {
	
	public void handleRequest(String soundRequest);
	public void setNext(ISoundEventHandler next);

}
