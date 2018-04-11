package Factory;

import Shapes.*;

/**
 * Simple Factory: Encapsulates the object instantiation process 
 * 
 * Factory Method: Defines an interface for creating an object, but let's the classes that
 * implement the interface decide which class to instantiate. The Factory method
 * lets a class defer instantiation to subclasses. 
 * 
 * Abstract Factory: Provides an interface for creating families of related or dependent 
 * objects without specifying their concrete classes
 */
public class ShapeFactory {

	Shape createTriangle() {
		return new Triangle();
	}

	Shape createCircle() {
		return new Circle();
	}

	Shape createSquare() {
		return new Square();
	}

	Shape createShape(String name) throws Exception {
		if (name.equals("Circle")) {
			return new Circle();
		} else if (name.equals("Square")) {
			return new Square();
		} else if (name.equals("Triangle")) {
			return new Triangle();
		} else {
			throw new IllegalArgumentException("Invalid shape name");
		}
	}
}
