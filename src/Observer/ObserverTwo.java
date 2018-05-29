package Observer;

public class ObserverTwo implements Observer{

	@Override
	public void actionPerformed() {
		System.out.println("Observer Two was notified of the action performed");
	}

}
