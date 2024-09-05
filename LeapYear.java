package sample;
import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the year:");
		int n=sc.nextInt();
		if((n%4==0 && n%100!=0) ||(n%400==0)) {
			System.out.print("It is a Leap year");
		}
		else
			System.out.print("It is a not Leap year");
	}

}
