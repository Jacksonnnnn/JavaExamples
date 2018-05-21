package me.Jackson.JavaExamples;

public class VarArgs2 {
	//here, msg is a normal parameter and v is a vargs parameter.
	static void vaTest(String msg, int ... v) {
		System.out.print(msg + v.length + "\n\tContents: ");
		for(int x : v)
			System.out.print(x + " ");
		System.out.println();
	}
	public static void main(String[] args) {
		vaTest("One vararg: ", 10);
		vaTest("Three varargs: ", 1, 2, 3);
		vaTest("No varargs: ");
	}

}
