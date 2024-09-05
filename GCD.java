import java.util.*;
class Main{
    public static void main(String[]args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the first value:");
      int a=sc.nextInt();
      System.out.println("Enter the second value:");
      int b=sc.nextInt();
      if(a<b) {
        a=a-b;
        b=a+b;
        a=b-a;
      }
      int result=GCD(a,b);
      System.out.println(result);

    }
    static int GCD(int a,int b){
      if(b!=0){
        return GCD(b,a%b);
      }
      else {
        return a;
      }
    }
}
