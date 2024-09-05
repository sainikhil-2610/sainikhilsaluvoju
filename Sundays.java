import java.util.*;
public class Sundays {
    public static void main(String[] args) {
        int value;
        int count=0;
        HashMap<String,Integer> a=new HashMap<String,Integer>();
        a.put("mon", 1);
        a.put("tue", 2);
        a.put("wed", 3);
        a.put("thu", 4);
        a.put("fri", 5);
        a.put("sat", 6);
        a.put("sun", 7);
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the day:");
        String s= sc.nextLine();
        System.out.print("Enter the no.of days:");
        int n= sc.nextInt();
        switch(s){
            case "mon":{
                          while(n>=6){
                          n=n-7;
                          count++;
                         } 
                         System.out.print(count);break;
                        }
            case "tue":{
                while(n>=5){
                    n=n-7;
                    count++;
                   } 
                   System.out.print(count);break;
                       }
            case "wed":{
                while(n>=4){
                    n=n-7;
                    count++;
                   } 
                   System.out.print(count);break;
                       } 
                       
            case "thu":{
                while(n>=3){
                    n=n-7;
                    count++;
                   } 
                   System.out.print(count);break;
                       }
            case "fri":{ 
                while(n>=2){
                    n=n-7;
                    count++;
                   } 
                   System.out.print(count);break;               
                       }  
            case "sat":{
                while(n>=1){
                    n=n-7;
                    count++;
                   } 
                   System.out.print(count);break;
                }
                
            case "sun":{
                while(n>=0){
                    n=n-7;
                    count++;
                   } 
                   System.out.print(count);break;
                    }            
        }
       
    }
}
