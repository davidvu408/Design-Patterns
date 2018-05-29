package Observer;

import java.util.ArrayList;

/**
 * The Subject in the Observer Pattern is the source for the change of events.
 * The Subject maintains a collection of Observers and notifies its observer
 * when a change has occurred
 * 
 */
public class Subject {

	ArrayList<Observer> observers;
	
	public Subject() { observers = new ArrayList<Observer>(); }
	
	public void add(Observer o) { observers.add(o); }
	
	public void remove(Observer o) { observers.remove(o); }
	
	public void eventChange() {
		for(Observer o : observers) {
			o.actionPerformed();
		}
	}
}
