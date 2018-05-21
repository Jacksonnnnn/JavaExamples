package me.Jackson.JavaExamples;

//Autoboxing/unboxing takes place with method parameters and return values.

public class AutoBox2 {
	
	//take an integer parameter and return an int value
	static int m(Integer v) {
		return v; //auto-unbox to int
	}
	public static void main(String[] args) {
		/*
		 * Pass an int to m() and assign the return value to an integer.
		 * Here, the argument 100 is autoboxed into an integer.
		 * The return value is also autoboxed into an integer.
		 */
		
		Integer iOb = m(100);
		
		System.out.println(iOb);
	}

}
