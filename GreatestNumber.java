package day2;

public class GreatestNumber {

	public static void main(String[] args) {
		//  finding out the greatest number among them.
		int n1,n2,n3,n4,n5;
		n1=20;
		n2=34;
		n3=7;
		n4=40;
		n5=50;
		if(n1>n2 && n1>n3 && n1>n4 && n1>n5) {
			System.out.println("n1 is greater");
		}
		else if(n2>n1 && n2>n3 && n2>n4 && n2>n5) {
			System.out.println("n2 is greater");
		}
		else if(n3>n1 && n3>n2 && n3>n4 && n3>n5) {
			System.out.println("n3 is greater");
		}
		else if(n4>n1 && n4>n2 && n4>n3 && n4>n5) {
			System.out.println("n4 is greater");
		}
		else {
			System.out.println("n5 is greater");
		}


	}

}
