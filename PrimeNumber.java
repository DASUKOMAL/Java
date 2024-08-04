package java_lab4;

import java.util.Scanner;
class Prime {
	
	/*---- Member variables -----*/
	private int starting,ending;
	/*-----------------------------------------*/
	/*--- Input of data through user ----*/
	
	public void primeNum() {

		/*--- creating object of scanner class -----*/
		Scanner sc = new Scanner(System.in);
		/*--- Taking input from the user  to Start the series ---*/
		System.out.print("Enter the starting number to degin : ");
		 starting = sc.nextInt();
		/*--- Taking input from the user for ending the series ---*/
		System.out.print("Enter ending point to stop :");
		 ending = sc.nextInt();
	}
	/*---- method of isprime -----*/
	public void isprime() {
		/*---- printing prime number from starting point to ending point----*/
		for (int i =starting ; i<ending ; i++)  {
			
			if (i%2==0) {
				//not a print number
				continue;
			}else {
				System.out.print(i+" , "); // prime number
				
			}
		}
	}
}

/*--------------------------------- Initial Class ---------------------------------*/
public class PrimeNumber {
	
	public static void main(String []args) {
		// Creating Object of Prime class	
	Prime ob = new Prime();
	/*---- method of input -----*/
	ob.primeNum();
	/*---- method of isprime -----*/
	ob.isprime();
	}
}