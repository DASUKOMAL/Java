package day2;

public class LeapYear {

	public static void main(String[] args) {
		//  to check a year is leap year or not.
		int year=2000;
		if(year%4==0 && (year%400==0 || year%100!=0))
			System.out.println(year+" is leap year");
		else
			System.out.println(year+" is not leap year");

	}

}
