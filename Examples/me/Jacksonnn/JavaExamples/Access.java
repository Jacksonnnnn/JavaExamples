package me.Jackson.JavaExamples;
/*
 * In a class hierarchy, private members remain private to their class.
 * This program contains an error and will not compile.
 */
public class Access {
	class A {
		int i; // public by default
		private int j; //private to A
		
		void setij(int x, int y) {
			i = x;
			j = y;
		}
	}
	//A's j is not accessible here.
	class B extends A {
		int total;
		
		void sum() {
			total = i + j; //ERROR: J is not accessible here
		}
	}
	public static void main(String[] args) {
		B subOb = new B();
		subOb.setij(10,  12);
		subOb.sum();
		System.out.println("Total is " + subOb.total);
	}

}