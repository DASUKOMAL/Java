package Java_lab3;

import java.util.Scanner;

public class palindrome_or_not {

	public static void main(String[] args) {
		/*---creating abject of Scanner class---*/
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter any number : ");
		int originalnum= sc.nextInt(); //--giving input through the user
		int  num=originalnum;
		int rev = 0;
		/*--Appling while loop for reversing the given number*/
		while (num!=0) {
			int digit = num%10; // Extract the last digit
			rev = rev *10 +digit; // Append the digit to the reversed number
			num = num / 10;	// Remove the last digit from the original number
		}
		//to check if the given number is Palindrome or not
		if (originalnum==rev) {
			System.out.println("the given "+originalnum+" is palindrome");
		}
		else {
			System.out.println("the given "+originalnum+" is not a palindrome");
		}
		
	}  
} 