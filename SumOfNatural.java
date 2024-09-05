import java.util.*;
public class Bb {
    public static void main(String[]args){
        int sum=0,i;
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter n value:");
       int n=sc.nextInt();
       for(i=0;i<=n;i++){
          sum=sum+i;
       }
       System.out.println("The sum of "+n+" natural number is: "+sum);

    }
}
