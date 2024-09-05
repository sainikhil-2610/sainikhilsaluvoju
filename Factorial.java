//Using Recursion
package sample;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number:");
		int n=sc.nextInt();
		int res=fact(n);
		System.out.print(res);
	}

	public static int fact(int n) {
		if(n==1) {
			return 1;
		}
		else
			 return n*fact(n-1);
	}

}
