/*
 * 																		PAGE 185
 * Using abstract methods and classes.
 */
package me.Jackson.JavaExamples2;
abstract class Figure {
	double dim1;
	double dim2;
	
	Figure(double a, double b) {
		dim1 = a;
		dim2 = b;
	}
	//area is now an abstract method
	abstract double area();
}
class Rectangle extends Figure {
	Rectangle(double a, double b) {
		super(a, b);
	}

	double area() {
		System.out.println("Inside Area for Rectangle.");
		return dim1 * dim2;
	}
}
class Triangle extends Figure {
	Triangle(double a, double b) {
		super(a, b);
	}

	double area() {
		System.out.println("Inside Area for Triangle.");
		return dim1 * dim2 /2;
	}
}
public class AbstractAreas {

	public static void main(String[] args) {
		//Figure f = new Figure(10, 10); //illegal now
		Rectangle r = new Rectangle(9, 5);
		Triangle t = new Triangle(10, 8);
		Figure figuref; //THIS IS OKAY, no object is created.
		
		figuref = r;
		System.out.println("Area is " + figuref.area());
		
		figuref = t;
		System.out.println("Area is " + figuref.area());
	}

}
