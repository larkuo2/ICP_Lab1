package lab1;

import java.util.Scanner;

public class Circle {
	public static void main(String [] args) {
		double pi = 3.141;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius: ");
		int radius = sc.nextInt();
		
		double Area = pi * radius*radius;
		double circumference = 2 * pi * radius;
		
		System.out.println("Area:");
		System.out.println( String.format( "%.2f", Area ) );
		System.out.println("Circumference:");
		System.out.println( String.format( "%.2f", circumference ) );
	}

}
