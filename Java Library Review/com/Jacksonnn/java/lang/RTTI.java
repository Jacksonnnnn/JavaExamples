package com.Jacksonnn.java.lang;

class X {
	int a;
	float b;
}

class Y extends X {
	double c;
}

public class RTTI {
	public static void main(String[] args) {
		X x = new X();
		Y y = new Y();
		Class<?> clObj;
		
		clObj = x.getClass(); //get Class Reference
		System.out.println("X is object of type: " + clObj.getName());
		
		clObj = y.getClass(); //get class reference.
		System.out.println("Y is object of type: " + clObj.getName());
		
		clObj = clObj.getSuperclass();
		System.out.println("Y's superclass is " + clObj.getName());
	}
}
