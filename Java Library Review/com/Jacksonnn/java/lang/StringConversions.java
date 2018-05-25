package com.Jacksonnn.java.lang;

public class StringConversions {

	public static void main(String[] args) {
		//Convert an integer into binary, hexadecimal, and octal.
		int num = 19648;
		System.out.println(num + " in binary: " + Integer.toBinaryString(num));
		
		System.out.println(num + " in octal: " + Integer.toOctalString(num));
		
		System.out.println(num + " in hexadecimal: " + Integer.toHexString(num));
	}

}
