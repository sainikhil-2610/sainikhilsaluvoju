import java.util.Scanner;
public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the No.of Patterns:");
        int n = sc.nextInt();
        int i,j;
        for(i=0;i<n;i++){
          for(j=0;j<=i;j++){
              System.out.print("*"+" ");
          }
          System.out.print("\n");
        }
    }
}
