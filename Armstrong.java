package sample;
import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number:");
		int n=sc.nextInt();
		int org=n;
		int n1=n%10;
		int digit=0,res=0;
		while(n!=0) {
         digit=n%10;
         res=(int)(res+Math.pow(digit,n1));
         n=n/10;
	}
		if(org==res)
			System.out.print("It is a ArmStrong");
		else
			System.out.print("It is a  not ArmStrong");

}
}
