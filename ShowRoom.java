package java_lab5;

import java.util.Scanner;
class ShowRoomDetails{
	
	/*---- Member variables -----*/
	String customerName; //sting Datatype
    long mobno;  //long Datatype
    double cost,discount,amount;  // double Datatype
	/*-----------------------------------------*/
	/*--- Input of data through user ----*/
    public void Input() {
    	//creating Object to Scanner class
    	Scanner sc = new Scanner(System.in);
    	System.out.println("--------------- Customer Details ---------------");
    	System.out.print("Enter customer name : ");
    	customerName=sc.nextLine(); //taking input name through user in string format
    	System.out.print("Enter customer mobile number : ");
    	mobno =sc.nextLong();  //taking input customer name through user in long format
    	System.out.print("Enter customer purchased amount : ");
    	cost=sc.nextDouble();  //taking input through user in integer format
    }
    /*----------------------------------------------------------------------------------*/
    /*--- calculate the discount for the amount purchased by the customer ----*/
    public void calculateDiscount() {
        if (cost <= 10000) {
            discount = cost * 0.05; 
        } else if (cost <= 20000) {
            discount = cost * 0.10;
        } else if (cost <= 35000) {
        	discount= cost * 0.15;
        } else {
        	discount = cost * 0.20;
        }
        amount = cost - discount;
    }
    public void displayDetails() {
    	System.out.println("--------------- billing amount ---------------");
        System.out.println("Customer Name: " + customerName);
        System.out.println("Mobile Number: " + mobno);
        System.out.println("mount Before Discount : " + cost);
        System.out.println("Amount to be Paid After Discount: " + amount);
    }
}
/*--------------------------------- Initial Class ---------------------------------*/
public class ShowRoom {

	public static void main(String[] args) {
		/* ---- Creating Object of showRoom class ----*/
		ShowRoomDetails ob = new ShowRoomDetails();
		/* ---- method for Input ----*/
		ob.Input();
		/* ---- method for calculating discount ----*/
		ob.calculateDiscount();	
		/* ---- method for calculating discount ----*/
		ob.displayDetails();

	}

}
