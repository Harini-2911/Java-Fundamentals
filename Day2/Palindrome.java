package Day2;
import java.util.Scanner;
public class Palindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int rev=0,t=n;
		while(n>0) {
			int d=n%10;
			rev=rev*10+d;
			n/=10;
		}
		if(rev==t) {
			System.out.print("Palindrome");
		}
		else {
			System.out.print("Not Palindrome");
		}
	}
}
