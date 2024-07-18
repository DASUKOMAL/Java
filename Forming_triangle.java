package day2;

public class Forming_triangle {

	public static void main(String[] args) {
		//taking any three angles and check they form a triangle or not.
		int angle1 = 70;
		int angle2 = 50;
		int angle3 = 60;
		//checking all three angles can form a triangle
		int total = angle1+angle2+angle3;
		if(total==180) {
			System.out.println("It form's a triangle");
		}
		else {
			System.out.println("It does not form a Triangle");

		}
		


	}

}
