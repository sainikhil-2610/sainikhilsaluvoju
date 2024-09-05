import java.util.*;
public class CheckSorted {
    public static void main(String[] args) {
        int i;
        boolean flag=false;
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the array size:");
       int n = sc.nextInt();
       System.out.print("Enter the array elements:");
       int []a=new int[n];
       for(i=0;i<n;i++){
         a[i]=sc.nextInt();
       }
      for(i=1;i<n;i++){
         if(a[i-1]<a[i]){
            flag=true;
            continue;
         }
         else{
            break;
         }
      }
      if(flag==true){
          System.out.print("true");
      }
      else
          System.out.print("false");
    }
}
