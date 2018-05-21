package me.Jackson.JavaExamples;

import me.Jackson.JavaExamples2.Gen;

class Gen<T> {
	T ob;
	
	//Pass the constructor a reference to an object of type T.
	Gen(T o) {
		ob = o;
	}
	
	//Return ob.
	T getob() {
		return ob;
	}
}

public class RawDemo {

	public static void main(String[] args) {
		Gen<Integer> iOb = new Gen<Integer>(88);
		
		//Create a Gen object for Strings.
		Gen<String> strOb = new Gen<String>("Generics Test");
		
		//Create a raw-type Gen object and give it a Double value.
		Gen raw = new Gen(Double.valueOf(98.6));
		
		//Cast here is necessary because type is unknown.
		double d = (Double) raw.getob();
		System.out.println("value: " + d);
		
		//The use of a raw type can lead to run-time exceptions. Here are some examples.
		//int i = (Integer) raw.getob(); //runtime-error
		
		//This assignment overrides type safety.
		strOb = raw; //OK, but potentially wrong.
		//d = (Double) raw.getob(); //runtime-error
	}

}
