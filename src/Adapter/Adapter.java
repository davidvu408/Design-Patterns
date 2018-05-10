package Adapter;

/**
 * @author David Vu 
 * Context: In the case you want to use an existing class
 * (adaptee) in conjunction with a related interface (target) without
 * modify the adaptee class.
 * 
 * Solution: Create an 'Adapter' class that connects the adaptee 
 * and target classes
 */

public class Adapter implements Target{
	private Adaptee adaptee;
	
	public Adapter() {
		adaptee = new Adaptee();
	}
	
	// Note: Dependency Injection
	public Adapter(Adaptee adaptee) {
		this.adaptee = adaptee;
	}

	@Override
	public void connect() {
		adaptee.connectToApacheServer();
	}

	@Override
	public boolean isConnected() {
		return adaptee.connectionEstabished();
	}

	@Override
	public String getIPAddress() {
		return adaptee.getServerAddress();
	}

}
