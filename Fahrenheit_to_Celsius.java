package day2;

public class Fahrenheit_to_Celsius {

	public static void main(String[] args) {
		// to convert Fahrenheit into Celsius(32°F − 32) × 5/9 = 0°C
		double fahrenheit = 50;
		double convert= fahrenheit-32;
		double formula=5.0/9.0;
		double celsius= (convert * formula);
		System.out.println(fahrenheit);
		System.out.println(celsius);

		

	}

}
