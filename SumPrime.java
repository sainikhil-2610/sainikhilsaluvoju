import java.util.*;
import java.util.Collection;
public class SumPrime {
   public static void main(String[] args) {
    int i,j,sum=0;
    boolean flag=false;
    ArrayList<Integer> list =  new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the No.of elements  should present in array:");
    int n = sc.nextInt();
    System.out.print("Enter the array elements:");
    int[]a=new int[n];
    for(i=0;i<n;i++){
     a[i]=sc.nextInt();
    }
 for(i=0;i<n;i++){
   for(j=2;j<a[i];j++){
    if(a[i]%j==0){
      flag=true;break;
    }
    else{
      if(a[i]%5==0){
          break;
      }
      else
           list.add(a[i]);break;
    }
   } 
   }
   Collections.sort(list);
   list.remove(0);
   for(i=0;i<list.size();i++){
      sum=sum+list.get(i);
   }
   System.out.print(sum);
}
}
