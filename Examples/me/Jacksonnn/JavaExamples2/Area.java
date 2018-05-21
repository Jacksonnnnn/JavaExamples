package me.Jackson.JavaExamples2;

import java.util.Scanner;

public class Area {
	public static void main(String[] args) {
		int length;
		int width;
		int area;
		String units;
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What are the units for your length and width?");
		units = scanner.next();
		
		System.out.println("What is the length of your rectangle?");
		length = scanner.nextInt();
		
		System.out.println("What is the width of your rectangle?");
		width = scanner.nextInt();
		
		area = length * width;
		System.out.println("The area of your rectangle is " + area + " " + units);
	}
}
