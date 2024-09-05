import java.util.Scanner;

public class SolidHallowRhombus {
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the No.of Rows:");
    int n = sc.nextInt();
    int j,i,k;
    for(i=1;i<=n;i++){
        for(j=1;j<=(n-i);j++){
            System.out.print(" ");
        }
        for(k=1;k<=n;k++){
         if(i==1||k==n||i==n||k==1){
         System.out.print("*");
         }
         else{
            System.out.print(" ");
         }
        }
        System.out.println();
        }
}
}
