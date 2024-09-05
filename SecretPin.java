import java.util.*;
public class SecretPin {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int i,n1,n2,n3,sum=0;
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
        if(input4%2==0){
         while(input1!=0){
            n1=input1%10;
            if(n1%2==0){
             list.add(n1);
            }
          input1=input1/10;
        }
        while(input2!=0){
            n2=input2%10;
            if(n2%2==0){
             list.add(n2);
            }
          input2=input2/10;  
    }
    while(input3!=0){
        n3=input3%10;
        if(n3%2==0){
         list.add(n3);
        }
      input3=input3/10;
}
}
       else{
        while(input1!=0){
            n1=input1%10;
            if(n1%2!=0){
             list.add(n1);
            }
          input1=input1/10;
        }
        while(input2!=0){
            n2=input2%10;
            if(n2%2!=0){
             list.add(n2);
            }
          input2=input2/10;  
    }
    while(input3!=0){
        n3=input3%10;
        if(n3%2!=0){
         list.add(n3);
        }
      input3=input3/10;
       }
}
for(i=0;i<list.size();i++){
    sum=sum+list.get(i);
}
System.out.print(sum);
}
}
}
        