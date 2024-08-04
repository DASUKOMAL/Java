package java_lab4;

import java.util.Scanner;

//define a class to check perfectNumber or not
class PerfectNum{
	
	/*---- Member variables -----*/
	private int number,originalNumber,divisors,sum;
	/*-----------------------------------------*/
	/*--- Input of data through user ----*/
	public void Input() {
		//creating Object to Scanner class
		Scanner sc = new Scanner(System.in);
		// user input 
		System.out.print("Enter a number : ");
		number = sc.nextInt();    //taking input through keyboard
		originalNumber = number;  //storing given number to originalNumber
	}
	
	/*-------------------------------------------------*/
	//method to check given number perfectNumber or not
	public void CalculatePerfect() {
		System.out.println("--------------------------");
		System.out.print("Divisors of "+number+" is :");
		//here taking for loop to find no.of divisors
		for(int i=1; i<number; i++) {
			if(number%i==0) {
				divisors=i;
				System.out.print(divisors+",");
				sum+=divisors;
			}
		}
		if(sum==originalNumber) {
			System.out.println("\n--------------------------");
			System.out.println(originalNumber+" is the Perfect Number");
		}
		else {
			System.out.println("\n--------------------------");
			System.out.println(originalNumber+" is not a Perfect number");
		}

	}
			
}

/*--------------------------------- Initial Class ---------------------------------*/
public class PerfectNumber {

	public static void main(String[] args) {
		/*----- Creating Object of perfect Number -----*/
		PerfectNum pf = new PerfectNum();
		// method of input
		pf.Input();
		/*----  method for checking perfect -----*/
		pf.CalculatePerfect();
	}

}