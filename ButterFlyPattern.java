import java.util.Scanner;

/**
  * ButterFlyPattern
  */
 public class ButterFlyPattern {
 
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the No.of Rows:");
    int n = sc.nextInt();
    int j,i,k;
    for(i=1;i<=n;i++){
     for(j=1;j<=i;j++){
          System.out.print("*");
     }
      for(k=0;k<2*(n-i);k++){
        System.out.print(" ");
      }
      for(j=1;j<=i;j++){
        System.out.print("*");
   }
   System.out.println();
    }
    for(i=n;i>0;i--){
       for(j=1;j<=i;j++){
             System.out.print("*");
       }
       for(k=0;k<2*(n-i);k++){
                System.out.print(" ");
       }
       for(j=1;j<=i;j++){
        System.out.print("*");
  }
       System.out.println();
    } 
 }
}
