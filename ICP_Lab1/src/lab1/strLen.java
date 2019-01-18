package lab1;

import java.util.Scanner;

public class strLen {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String input = sc.nextLine();
		
		int strLength = input.length();
		System.out.println("Length of String is: ");
		System.out.println(strLength);
	}
}
