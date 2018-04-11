package Singleton;

import java.util.Random;

import Shapes.Triangle;

public class NumberGeneratorTest {
	public static void main(String[] args) {
		Random r1 = NumberGenerator.getInstance();
		Random r2 = NumberGenerator.getInstance();
		
		Triangle t1 = new Triangle();
		Triangle t2 = new Triangle();
		
		// Hash codes are same
		System.out.println(System.identityHashCode(r1));
		System.out.println(System.identityHashCode(r2));
		
		System.out.println(); 
		
		// Hash codes are different
		System.out.println(System.identityHashCode(t1));
		System.out.println(System.identityHashCode(t2));
	}
}
