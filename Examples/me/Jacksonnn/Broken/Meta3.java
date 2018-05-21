package me.Jackson.Broken;

import java.lang.annotation.Retention;
import java.lang.reflect.Method;

//An annotation type declaration that includes defaults.
@Retention(RetentionPolicy.RUNTIME)
@interface myAnno {
	String str() default "Testing";
	int val() default 9000;
}

public class Meta3 {

	//Annotate a method using the default values.
	@myAnno()
	public static void myMeth() {
		Meta3 ob = new Meta3();
		
		//Obtain the annotation for this method
		//and display the values of these members.
		try {
			Class<?> c = ob.getClass();
			Method m = c.getMethod("myMeth");
			myAnno anno = m.getAnnotation(myAnno.class);
			
			System.out.println(anno.str() + " " + anno.val());
		} catch (NoSuchMethodException exc) {
			System.out.println("Method Not Found.");
		}
	}
	
	public static void main(String[] args) {
		myMeth();
	}

}
