
package sample;
import java.util.Scanner;

public class one {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.print("enter the string:");
    String name=sc.nextLine();
    String rev="";
    for(int i=name.length()-1;i>=0;i--) {
    	rev=rev+name.charAt(i);
    }
    if(name.equals(rev))
    	 System.out.print("It is a palindrome");
    else
    	System.out.print("It is a  not palindrome");

}
}