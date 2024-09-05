import java.util.*;
public class FirstRepeated{
    public static void main(String[] args) {
        int i,j,k=0;
        boolean flag=false;
        boolean yes = false;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Array Elements Size:");
        int n = sc.nextInt();
        System.out.print("Enter the Array Elements:");
        int []a=new int[n];
        int[]v=new int[n];
        for(i=0;i<n;i++){
          a[i]=sc.nextInt();
        }
        for(i=n-1;i>=0;i--){
            for(j=i-1;j>=0;j--){
                if(a[i]==a[j]){
                    v[k]=a[i];
                    k++;
                    flag=true;
                    if(a[j]<=0)
                      yes=true;
                }
            }
            }
                if(flag==true){
                    System.out.print(v[0]);
                }
                else{
                    if(yes==true)
                    System.out.print(0);
                    else{
                        System.out.print(v[0]);
                    }     
                }
               }
            }
        
    
