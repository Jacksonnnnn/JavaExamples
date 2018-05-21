package me.Jackson.JavaExamples2;

//NonGen is functionally equivalent to Gen but does not use generics.
class NonGen {
	Object ob; //ob is now of type Object
	
	//Pass on the constructor a reference to an object of type Object.
	NonGen(Object o) {
		ob = o;
	}
	
	//Return type Object.
	Object getob() {
		return ob;
	}
	
	//Show type of ob.
	void showType() {
		System.out.println("Type of ob is " + ob.getClass().getName());
	}
}

public class NonGenDemo {

	public static void main(String[] args) {
		NonGen iOb;
		
		iOb = new NonGen(88);
		
		iOb.showType();
		
		int v = (Integer) iOb.getob();
		System.out.println("value: " + v);
		
		System.out.println();
		
		NonGen strOb = new NonGen("Non-Generics Test");
		
		strOb.showType();
		
		String str = (String) strOb.getob();
		System.out.println("value: " + str);
		
		iOb = strOb;
		v = (Integer) iOb.getob();
	}

}
