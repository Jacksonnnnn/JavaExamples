package me.Jackson.JavaExamples;

import me.Jackson.JavaExamples2.Box;

/*
	Call this file BoxDemo.java
 */
class Box {
	double width;
	double height;
	double depth;
	
	double volume() {
		System.out.print("Volume is ");
		System.out.println(depth * height * width);
		return depth * height * width;
	}
	
	void setDim(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
	}
}
//This class declares an object of a type Box.
public class BoxDemo {
	public static void main(String args[]) {
		Box mybox = new Box();
		double vol;
		
		//assign values to mybox's instance variables
		mybox.width = 10;
		mybox.height = 20;
		mybox.depth = 15;
		
		//compute volume of box
		vol = mybox.width * mybox.depth * mybox.height;
		
		System.out.println("Volume is " + vol);
	}
}
