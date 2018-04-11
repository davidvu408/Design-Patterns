package Factory;

import java.util.Scanner;

import Shapes.Shape;

public class ShapeFactoryTest {
	public static void main(String[] args) {
		ShapeFactory factory = new ShapeFactory();
		Scanner in = new Scanner(System.in);
		try {
			while (in.hasNext()) {
				System.out.println("Enter the name of a shape to be created: Circle, Square, Triangle");
				String shapeName = in.nextLine();
				Shape shape = factory.createShape(shapeName);
				System.out.println("A " + shape.toString() + " was created.");
			}
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
