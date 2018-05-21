package me.Jackson.JavaExamples2;

public class TestIFace2 {

	public static void main(String[] args) {
		Callback c = new Client();
		AnotherClient ob = new AnotherClient();
		
		c.callback(42);
		
		c = ob; //c now refers to anotherclient object
		c.callback(42);
	}

}
