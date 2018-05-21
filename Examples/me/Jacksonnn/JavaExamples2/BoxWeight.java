package me.Jackson.JavaExamples2;
//BoxWeight now uses super to initialize its Box attributes.
public class BoxWeight extends Box {
	double weight; //weight of box
	
	//initialize width, height, and depth using super()
	BoxWeight(double w, double h, double d, double m) {
		super(w, h, d);
		weight = m;
	}
}
