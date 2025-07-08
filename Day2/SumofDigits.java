package Day2;
import java.util.Scanner;
public class SumofDigits {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		int l=String.valueOf(n).length();
		for(int i=0;i<l;i++) {
			int d=n%10;
			sum+=d;
			n/=10;
		}
		System.out.print(sum);
}
}
