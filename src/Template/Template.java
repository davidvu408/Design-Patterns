package Template;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import DependencyInjection.InjectShape;
import Factory.ShapeFactory;
import Shapes.Shape;
import Singleton.NumberGenerator;

/**
 * Context: An algorithm is needed that will be used for multiple types but 1)
 * the algorithm can be reduced to a combination of primitive operations and 2)
 * the order of the primitive operations doesn't matter
 * 
 */
public class Template {

	// In this example, the creation of a random shape every 5 seconds
	// and some operation being done on the shape right after via InjectShape (class)
	// is being abstracted and implemented via the Template Design Pattern.
	public void createShapes() throws Exception {
		ShapeFactory factory = new ShapeFactory();
		Random rGen = NumberGenerator.getInstance();

		InjectShape injectShape;
		while (true) {
			Shape shape = null;
			switch (rGen.nextInt(3)) {
			case 0:
				shape = factory.createShape("Circle");
				System.out.println(shape + " was created");
				break;
			case 1:
				shape = factory.createShape("Square");
				System.out.println(shape + " was created");
				break;
			case 2:
				shape = factory.createShape("Triangle");
				System.out.println(shape + " was created");
				break;
			} // end switch
			injectShape = new InjectShape(shape);
			injectShape.doSomethingWithShape();
			TimeUnit.SECONDS.sleep(5);
		}

	}
}
