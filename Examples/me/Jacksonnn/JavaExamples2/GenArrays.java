package me.Jackson.JavaExamples2;

class Gen<T extends Number> {
	T ob;
	
	T vals[]; //OKAY
	
	Gen(T o, T[] nums) {
		ob = o;
		
		vals = nums;
	}
}

public class GenArrays {

	public static void main(String[] args) {
		Integer n[] = { 1, 2, 3, 4, 5 };
		
		Gen<Integer> iOb = new Gen<Integer>(50, n);
		
		Gen<?> gens[] = new Gen<?>[10];
	}

}
