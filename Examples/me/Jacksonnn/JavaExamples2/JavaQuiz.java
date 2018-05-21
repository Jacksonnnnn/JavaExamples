package me.Jackson.JavaExamples2;

import java.util.Scanner;

public class JavaQuiz {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("What is the length (in yards) of the school's campus?");
		String l = in.nextLine();
		
		System.out.println("What is the width (in yards) of the school's campus?");
		String w = in.nextLine();

		double acres = l * w / 4840;
		
		System.out.println("The area of the campus in acres is " + acres + "acres.");
	}
}
