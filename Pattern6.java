import java.util.Scanner;

public class Pattern6 {
        public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the No.of Rows:");
    int row = sc.nextInt();
    System.out.print("Enter the No.of Columns:");
    int column = sc.nextInt();
   for(int i=1;i<=row;i++){
    for(int j=1;j<=column;j++){
       if(i==row||i==1||j==1||j==column){
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
