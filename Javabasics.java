import java.util.*;
public class Javabasics {
    public static void main(String[]args){
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the no.of patterns to be printed:");
      int n=sc.nextInt();
      for(int i=0;i<=n;i++){
        for(int j=0;j<i;j++){
        System.out.print("*");
      }
      System.out.print("\n");
    }
}
}
