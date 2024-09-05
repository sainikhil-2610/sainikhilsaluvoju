package sample;
import java.util.Scanner;
import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Array Size:");
		int n=sc.nextInt();
		int a[]=new int[n];		
		System.out.print("Enter the Array Elements:");
		for(i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		for(i=0;i<n-1;i++) {
			for(j=i;j<n-i-1;j++) {
			if(a[j]>a[j+1]) {	
				int t=a[j];
				a[j]=a[j+1];
				a[j+1]=t;
			}
			}
		}
		for(i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}

	}

}
