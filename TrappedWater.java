import java.util.Scanner;
public class TrappedWater {
    public static void main(String[] args) {
        int i,j,sum=0;
        int trappedwater=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size:");
        int n=sc.nextInt();
        int [] a=new int[n];
        System.out.print("Enter the array elements:");
        for(i=0;i<n;i++){
           a[i]=sc.nextInt();
        }
        int [] LeftMax=new int[n];
        LeftMax[0]=a[0];
        int [] RightMax=new int[n];
        RightMax[n-1]=a[n-1];
        int [] waterlevel =new int[n];
        /*for(i=0;i<n;i++){
            for(j=i;j>=0;j--){
              if(j==0){
               LeftMax[i]=a[j];
              }
              else if(a[j]>=LeftMaxValue){
                 LeftMaxValue=a[j];
                 LeftMax[i]=a[j];
              }
            }
        }
        for(i=n-1;i>=0;i--){
            for(j=0;j<n;j++){
              if(j==n-1){
               LeftMax[i]=a[j];
              }
              else if(a[j]>=RightMaxValue){
                 LeftMaxValue=a[j];
                 RightMax[i]=a[j];
              }
            }
        }*/
        //LeftMax Array
    
        for(i=1;i<n;i++){
         LeftMax[i]=Math.max(a[i],LeftMax[i-1]);
        }
        //Right MAx Array
        for(i=n-2;i>=0;i--){
         RightMax[i]=Math.max(a[i],RightMax[i+1]);
        }
    /*i=0;
    while(i<n) {
       if(LeftMax[i]<RightMax[i]){
        Result[i]=LeftMax[i];
        i++;
    }
    else if(LeftMax[i]>RightMax[i]){
        Result[i]=RightMax[i];
        i++; 
    }
}
       for(i=0;i<Result.length;i++){
           Result[i]=Result[i]-a[i];
             if(Result[i]<0)
                Result[i]=0;
            }
            for (i=0;i<n;i++) {
              sum+=Result[i];  
            }*/

for(i=0;i<n;i++){
     waterlevel[i]=Math.min(LeftMax[i],RightMax[i]);
}
for(i=0;i<n;i++){
    trappedwater+=waterlevel[i]-a[i];
}
System.out.print(trappedwater);
}
}
