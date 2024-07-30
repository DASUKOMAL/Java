package Java_lab3;

public class Pattern {

	public static void main(String[] args) {
		/*--- display the following pattern---*/ 
		for(int i=1; i<=5; i++) { 
			//print number from 1 to i in each row
			for(int j=1; j<=i; j++) {  
				
				System.out.print(j);
			}
			System.out.println(); //move to the next line
		}
	}

}
