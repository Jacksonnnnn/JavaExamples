package me.Jackson.JavaExamples2;

interface Callback {
	void callback(int param);
}

public class Client implements Callback {
	public static void main(String[] args) {
		
	}

	@Override
	public void callback(int p) {
		System.out.println("callback called with " + p);
	}
	void nonIfaceMeth() {
		System.out.println("Classes that implement interfaces " + "may also define other members too.");
	}
}
