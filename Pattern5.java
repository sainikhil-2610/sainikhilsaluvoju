import java.util.Scanner;
class Pattern5{
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the No.of Patterns:");
    int n = sc.nextInt();
    int i,j;
   for(i=0;i<n;i++){
    for(j=1;j<=n-i;j++){
           System.out.print(j);
   }
   System.out.println();
   }
}
}
