package Singleton;

import java.util.Random;

/**
 * The Singleton pattern restricts the instantiation of some class to one in an entire program.
 * To implement the Singleton pattern:
 *  1) Initialize an instance of the class inside the class itself (this is the singleton object)
 * 	2) Define a class with a private constructor 
 *  3) Supply a static method that returns a reference to the singleton object
 */
@SuppressWarnings("serial")
public class NumberGenerator extends Random {

	private static Random generator = new NumberGenerator();
	
	private NumberGenerator() { }
	
	public static Random getInstance() { return generator; }
	

}
