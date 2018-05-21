package me.Jackson.JavaExamples2;

public class AssertDemo {
	
	static int val = 3;
	
	//return and integer.
	static int getnum() {
		return val--;
	}
	
	public static void main(String[] args) {
		int n;
		
		for(int i = 0; i < 10; i++) {
			n = getnum();
			
			assert n > 0; //will fail when n == 0
			
			System.out.println("n is " + n);
		}
			
	}

}
