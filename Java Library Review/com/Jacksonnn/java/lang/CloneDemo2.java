package com.Jacksonnn.java.lang;

class TestClone2 implements Cloneable {
	int a;
	double b;
	
	//clone() is now overriden and is public.
	public Object clone() {
		try {
			//call clone in object
			return super.clone();
		} catch(CloneNotSupportedException e) {
			System.out.println("Cloneing not allowed.");
			return this;
		}
	}
}

public class CloneDemo2 {

	public static void main(String[] args) {
		TestClone2 x1 = new TestClone2();
		TestClone2 x2;
		
		x1.a = 10;
		x1.b = 20.98;
		
		//here, clone() is called directly.
		x2 = (TestClone2) x1.clone();
		
		System.out.println("x1: " + x1.a + " " + x1.b);
		System.out.println("x2: " + x2.a + " " + x2.b);
	}

}
