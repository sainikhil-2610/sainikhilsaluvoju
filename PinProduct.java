import java.util.*;
public class PinProduct {
   public static void main(String[] args) {
        int max1,min1,max2,min2,max3,min3;
        int product=1;
        int i,n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the input4:");
        int input4=sc.nextInt();
        System.out.print("Enter the input1:");
        int input1=sc.nextInt();
        System.out.print("Enter the input2:");
        int input2=sc.nextInt();
        System.out.print("Enter the input3:");
        int input3=sc.nextInt();
        if((input1<9999 && input1>1000)&&(input2<9999 && input2>1000)&&(input3<9999 && input3>1000)){
            while(input1!=0){
              n=input1%10;
              min1=0;
              max1=0;
              if(n>max1){
                min1=max1;
                max1=n;
              }
              input1=input1/10;
          }
          while(input1!=0){
            n=input1%10;
            min1=0;
            max1=0;
            if(n>max1){
              min1=max1;
              max1=n;
            }
            input1=input1/10;
        }
        while(input1!=0){
          n=input1%10;
          min1=0;
          max1=0;
          if(n>max1){
            min1=max1;
            max1=n;
          }
          input1=input1/10;
      }
        }

    }
  product=(((max1*min1)*(max2*min2)*(max3*min3))-input4);
}
}

