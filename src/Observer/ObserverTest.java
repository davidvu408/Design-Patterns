package Observer;

public class ObserverTest {
	public static void main(String[] args) {
		Subject subject = new Subject();
		subject.add(new ObserverOne());
		subject.add(new ObserverTwo());
		subject.eventChange();
	}
}
