package me.Jackson.JavaExamples;

import me.Jackson.JavaExamples.*;
import me.Jackson.JavaExamples2.Box;

//This program declares two Box objects
public class BoxDemo5 {
	@SuppressWarnings("unused")
	public static void main(String args[]) {
		Box mybox1 = new Box();
		Box mybox2 = new Box();
		double vol;
		
		mybox1.setDim(10,20,15);
		mybox2.setDim(3,6,9);
		
		vol = mybox1.volume();
		
		vol = mybox2.volume();
	}
}
