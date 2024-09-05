import java.util.Scanner;

public class Pattern8 {
   public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the No.of Rows:");
    int row = sc.nextInt();
    System.out.print("Enter the No.of Columns:");
    int column = sc.nextInt();
    int j,i; 
    for(i=1;i<=row;i++){
        for(j=1;j<=i;j++){
          if((i+j)%2==0){
                System.out.print("1"); 
          }
          else{
            System.out.print("0");
          }
             
        }
        System.out.println();
    }
}
}
