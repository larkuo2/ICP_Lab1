package lab1;


import java.util.Scanner;
public class reverseString {
	
    public static void main (String[] args) {
        System.out.println("Enter String");
        Scanner input = new Scanner(System.in);
        String reverse= input.nextLine();
        String Fixed="";
        
        for(int i= reverse.length()-1;i>=0;i--) {
                      Fixed= Fixed+ reverse.charAt(i);
                                 
        }
        System.out.println(Fixed);
    }
	

}
