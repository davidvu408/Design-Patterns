package Observer;

public class ObserverOne implements Observer{

	@Override
	public void actionPerformed() {
		System.out.println("Observer One was notified of the action performed");
	}

}
