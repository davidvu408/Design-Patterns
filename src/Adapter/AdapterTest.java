package Adapter;

public class AdapterTest {

	public static void main(String[] args) {
		Adaptee adaptee = new Adaptee();
		// Note: By using the Adapter class which extends the Target interface
		// and provides implementation with the Adaptee's methods, there is a connection
		// between the two now through the Adapter class. Without modifying the Adaptee class,
		// it can now be used in conjunction with the Target interface through the Adapter class.
		Target adapter = new Adapter(adaptee);
		adapter.connect();
		System.out.println(adapter.isConnected());
		System.out.println(adapter.getIPAddress());
	}

}
