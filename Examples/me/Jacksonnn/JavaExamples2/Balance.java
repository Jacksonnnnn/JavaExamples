package me.Jackson.JavaExamples2;
/*
 * Now the Balance Class, its constructor, and its show() method are public. This means that they can be used by non-subclass code outside their package.
 */
import java.util.*;
public class Balance extends Date {
	String name;
	double bal;
	
	public Balance(String n, double b) {
		name = n;
		bal = b;
	}
	
	public void show() {
		if(bal<0)
			System.out.println("--> ");
		System.out.println(name + ": $" + bal);
	}
}
