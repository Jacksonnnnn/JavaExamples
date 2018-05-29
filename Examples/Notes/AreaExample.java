package Notes;

import java.util.Scanner;

public class AreaExample {
   public static void main(String[] args)
   {	//make a new scanner variable
	   	@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
	   
	   	//print a request for the user
	   	System.out.println("Enter the length of Rectangle:");
	   
	   	//make a new input variable
	   	double length = scanner.nextDouble();
	   
	   	System.out.println("Enter the width of Rectangle:");
	   
	   	double width = scanner.nextDouble();
	   
	   	//Area = length*width;
	   
	   	double area = length*width;
	   
	   	System.out.println("Area of Rectangle is: " + area);
   }
}