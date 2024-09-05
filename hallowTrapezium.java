package sample;
import java.util.Scanner;
public class hallowTrapezium {

	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows:");
		int n=sc.nextInt();
		for(i=1;i<=n;i++) {
			for(j=1;j<=n;j++){
				if(j==1||j==i) {
					System.out.print("*");
				}
				else
					System.out.print(" ");
		}
			System.out.println();
			

	}
		for(i=1;i<=n;i++) {
			for(j=1;j<=n;j++){
				if(j==1||i==n||j==n) {
					System.out.print("*");
				}
				else
					System.out.print(" ");
		}
			System.out.println();
			

	}

}
}}
