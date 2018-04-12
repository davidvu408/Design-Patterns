package DependencyInjection;

import Shapes.Shape;

/**
 * In Dependency Injection, instead of initializing objects a class needs, they
 * must be given (injected) by a programmer or program. 
 * 
 * Constructor Injection 
 * Setter Injection 
 * Interface Injection
 */
public class InjectShape {
	private Shape shape;

	public InjectShape() {
	}

	// Example of Constructor Injection
	public InjectShape(Shape shape) {
		this.shape = shape;
	}

	public void doSomethingWithShape() throws Exception {
		if (shape == null) {
			throw new Exception("shape has not been initialized");
		} else {
			System.out.println("[" + this.getClass() + "] did something with: "
					+ shape.toString());
		}
	}

	// Example of Setter Injection
	public void setShape(Shape shape) {
		this.shape = shape;
	}

	public String toString() {
		return shape.toString();
	}
}
