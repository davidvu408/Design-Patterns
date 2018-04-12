package DependencyInjection;

import Shapes.*;

public class InjectShapeTest {
	public static void main(String[] args) {
		Triangle t = new Triangle();
		Circle c = new Circle();
		Square s = new Square();
		
		try {
			// Constructor Injection
			InjectShape test_two = new InjectShape(t);
			test_two.doSomethingWithShape();
			
			// Setter Injection
			InjectShape test = new InjectShape();
			
			// Inject Circle
			test.setShape(c);
			test_two.doSomethingWithShape();
			
			// Inject Square
			test.setShape(s);
			test_two.doSomethingWithShape();
			
			// Test service with no shape
			test.doSomethingWithShape();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
