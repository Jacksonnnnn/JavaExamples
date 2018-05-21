package me.Jackson.JavaExamples2;

class MyIFImp implements MyIF {
	public int getNumber() {
		return 100;
	}
}
interface MyIF {
	int getNumber();
	
	default String getString() {
		return "Default String";
	}
}

public class DefaultMethodMDemo {
	public static void main(String[] args) {
		MyIFImp obj = new MyIFImp();
		
		System.out.println(obj.getNumber());
		
		System.out.println(obj.getString());
	}
}
