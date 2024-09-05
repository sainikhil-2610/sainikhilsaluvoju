import java.util.Scanner;
public class SmallestElement {

    public static void main(String[]args){
        int i,j;
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the size of array:");
      int n =sc.nextInt();
      int []a= new int[n];      
      Scanner scn = new Scanner(System.in);
      System.out.print("Enter the array elements:");
      for (i=0;i<n;i++) {
        a[i]=scn.nextInt();
      }
         for(i=0;i<n;i++){
            if(a[i]>a[i+1]){
                System.out.print(a[i+1]);break;
            }
          }
         }
    }

