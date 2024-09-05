import java.util.Scanner;

public class Pattern7 {
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the No.of Rows:");
    int row = sc.nextInt();
    System.out.print("Enter the No.of Columns:");
    int column = sc.nextInt();
    int j,i,k,a,m;
   for(i=1;i<=row;i++){
    for( j=1;j<=row-i;j++){
        System.out.print(" ");
         }
          k=i;
      while(k!=0){
           System.out.print("*");k--;
      }
      a=i-1;
      while(a!=0){
               System.out.print("*");a--;
      }
      for(m=j+i;m<=row-1;m++){
        System.out.print(" ");
       }
      System.out.println();
    }
    
   }
}

