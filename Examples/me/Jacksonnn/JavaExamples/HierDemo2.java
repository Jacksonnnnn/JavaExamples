package me.Jackson.JavaExamples;

//A non-generic class can be the superclass of a generic subclass.

//A non-generic class.
class NonGen {
	int num;
	
	NonGen(int i) {
		num = i;
	}
	
	int getnum() {
		return num;
	}
}

//A generic subclass.
class Gen<T> extends NonGen {
	T ob;
	
	Gen(T o, int i) {
		super(i);
		ob = o;
	}
	
	//return ob
	T getob() {
		return ob;
	}	
}
public class HierDemo2 {

	public static void main(String[] args) {
		//Create a Gen object for String.
		Gen<String> w = new Gen<String>("Hello", 47);
		
		System.out.print(w.getob() + " ");
		System.out.println(w.getnum());
	}

}
