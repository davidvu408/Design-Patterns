package Shapes;

public abstract class Shape {

	String name;
	
	public Shape(String name) {
		this.name = name;
	}
	public String getName() { return name; }

	public void setName(String name) { this.name = name; }

	public String toString() {return name;}
}
