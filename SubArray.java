//This Program follow Max.sum and Min.Sum of Kadane's Rule
import java.util.*;
public class SubArray {
    public static void main(String[] args) {
        int i,j,k,count=0,sum=0,res=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no.of elements: ");
        int n =sc.nextInt();
        System.out.print("Enter the Array Elements:");
        int []a = new  int[n];
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int min=a[0],max=a[0];
        for(i=0;i<n;i++){
          for(j=i;j<n;j++){
            res=0;
            for(k=i;k<=j;k++){
                res=res+a[k];
                   sum=res;  
                System.out.print(a[k]+" ");
            }
            if(sum>max)
                max=sum;
            if(min>=sum)
                min=sum;
            System.out.print(";Sum of SubArray:"+"-->"+sum);
            count++;
            System.out.println();
          }
        }
      System.out.println("Number of SubArrays: "+count);
      System.out.println("Mininum sum of SubArray is: "+min);
      System.out.print("Maximum Sum of SubArray is: "+max);
    }
}
