package java_lab4;

import java.util.Scanner;
class Armstrong {
	
	/*---- Member variables -----*/
	private int number,reminder,sum,originalNumber ;
	/*-----------------------------------------*/
	/*--- Input of data through user ----*/
	
	public void NumberInput() {

		/*--- creating object of scanner class -----*/
		Scanner sc = new Scanner(System.in);
		/*--- Taking input from the user  to Start the series ---*/
		System.out.print("Enter any number to check Amstrong or not : ");
		 number = sc.nextInt();   //taking input value from the user
		 originalNumber = number; //storing given number to originalNumber
	}
    // Method to check if a number is an Armstrong number
    public void calculateArmstrong() {
        
        // Calculate the sum of each digit raised to the power of the number of digits
    	while(number!=0) {    
			reminder=number%10;
			sum+=reminder*reminder*reminder;
			number=number/10;
    	}
    	/*----- Return true if the sum is equal to the original number -----*/
    	if(sum==originalNumber) {
    		
			System.out.println(originalNumber+" is Armstrong Number");
			
		}
    	/*----- Return false if the sum is not-equal to the original number -----*/
		else {
			System.out.println(originalNumber+" is Not an Armstrong Number");
		}
    }
}    

/*--------------------------------- Initial Class ---------------------------------*/
public class ArmstrongNumber {
	
	public static void main(String []args) {
		/*----- Creating Object of Armstrong Number -----*/
	    Armstrong ob = new Armstrong();
	    /*---- method of input -----*/
	    ob.NumberInput();
	    /*----  method for checking ArmstrongNumber -----*/
	    ob.calculateArmstrong();
	}
}
