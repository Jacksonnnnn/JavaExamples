package me.Jackson.JavaExamples;

public class VarArgs4 {
	static void vaTest(int ... v) {
		System.out.print("vaTest(int ...): " + "Number of args: " + v.length + "\n\tContents: ");
		for(int x : v)
			System.out.print(x + " ");
		System.out.println();
	}
	static void vaTest(boolean ... v) {
		System.out.print("vaTest(boolean ...); " + "Number of args: " + v.length + "\n\tContents: ");
		for(boolean x : v)
			System.out.print(x + " ");
		System.out.println();
	}
	static void vaTest(String msg, int ... v) {
		System.out.print("vaTest(String, int ...): " + msg + v.length + "\n\tContents: ");
		for(int x : v)
			System.out.print(x + " ");
		System.out.println();
	}	
	public static void mian(String args[]) {
		vaTest(1, 2, 3); //OKAY
		vaTest(true, true, false); //OKAY
		vaTest(); //ERROR: Ambiguous!
	}
}
