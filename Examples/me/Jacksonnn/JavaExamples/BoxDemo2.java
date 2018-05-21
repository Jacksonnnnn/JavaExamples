package me.Jackson.JavaExamples;

import me.Jackson.JavaExamples.*;
import me.Jackson.JavaExamples2.Box;

//This program declares two Box objects
public class BoxDemo2 {
	@SuppressWarnings("unused")
	public static void main(String args[]) {
		Box mybox1 = new Box();
		Box mybox2 = new Box();
		double vol;
		
		//assign values to mybox1's instance variables
		mybox1.width = 10;
		mybox1.height = 20;
		mybox1.depth = 15;
		
		/* Assign different values to mybox2's instance variables*/
		mybox2.width = 3;
		mybox2.height = 6;
		mybox2.depth = 9;
		
		//compute volume of first box
		vol = mybox1.width * mybox1.height * mybox1.depth;
		System.out.println("Volume 1 is " + vol);
		
		vol = mybox2.width * mybox2.height * mybox2.depth;
		System.out.println("Volume 2 is " + vol);
	}
}
