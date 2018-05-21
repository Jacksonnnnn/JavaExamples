package me.Jackson.JavaExamples2;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("What is your name?  ");
		String name = in.nextLine();
		
		System.out.println("So your name is " + name);
	}
}