package sample;
import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Array Size:");
        int n= sc.nextInt();
        System.out.print("Enter the Array Elements:");
        int []a=new int[n];
        for(i=0;i<n;i++){
         a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++){
          for(j=i;j>=1;j--){
            if(a[j-1]<a[j])
                continue;
            else{
                int t=a[j-1];
                a[j-1]=a[j];
                a[j]=t;
            }
          }
        }
        for (int  k : a) 
            System.out.print(k+" ");
        
	}

}
