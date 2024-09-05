import java.util.*;
public class Solution1 {
    public static void main(String[] args) {
        int i,j,lar=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size:");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.print("Enter the array elements:");
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.print("Enter the Kth Element:");
       int k =sc.nextInt();
       Arrays.sort(a);
       for(i=0;i<n;i++){
        System.out.print(a[i]+" ");
       }
       while(k!=0){
        i=n-1;
         while(i>=0){
             lar=a[i];
             i--;
             k--;
         }
    }
    System.out.print(lar);
}
}
