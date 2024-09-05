import java.util.Scanner;
public class DecimalToBinary {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Decimal Value:");
    int n =sc.nextInt();
        int []a=new int[4];
      for(int i=0;i<4;i++){
        a[i]=(n%2);
        n=n/2;
      }
      for(int i=3;i>=0;i--){
      System.out.print(1^a[i]);}
  } 

}
