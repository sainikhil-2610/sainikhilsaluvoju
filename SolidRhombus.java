import java.util.Scanner;

public class SolidRhombus {
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the No.of Rows:");
    int n = sc.nextInt();
    int j,i,k;
    for(i=1;i<=n;i++){
        for(j=1;j<=(n-i);j++){
            System.out.print(" ");
        }
        k=n;
        while(k!=0){
            System.out.print("*");k--;
            
        }
        System.out.println();
        }
}
}
