public class Prob2 {
    public static void main(String[]args){
        int i,j,t=0;
        int[]a={9,3,4,2,5,6,1,10};
        int len=a.length;
        i=len/2;
        while(i<len){
                t=a[i];
                a[i]=a[i-len/2];
                a[i-len/2]=t;
                 i++;
            }
        
        
        for(i=0;i<len;i++){

                System.out.print(a[i]+" ");
    }
}
}
