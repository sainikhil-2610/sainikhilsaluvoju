import java.util.Scanner;
public class SecondLargest {
    public static void main(String[]args){
        int i,j,first,second;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int n =sc.nextInt();
        int []a= new int[n];      
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the array elements:");
        for ( i=0;i<n;i++) {
            a[i]=scn.nextInt();
      }
       first=a[0];
       second=a[1];
      for( i=0;i<n;i++){
        for(j=i;j<n;j++){
         if(a[i]>first){
             if(a[j]<second && first>a[j]){
                System.out.print("Second Largest Is:"+second);break;
             }
         }
        
        
    }
}


}
}
