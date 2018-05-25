package com.Jacksonnn.java.lang;

//Timing elapsed execution.

public class Elapsed {

	public static void main(String[] args) {
		long start, end;
		
		System.out.println("Timing for a floop from 0 to 100,000,000");
		
		start = System.currentTimeMillis(); //get Starting Time.
		
		for(long i=0; i< 100000000; i++) ;
		
		end = System.currentTimeMillis(); //get Ending Time.
		
		System.out.println("Elapsed time (Milli): " + (end-start));
		
	}

}
