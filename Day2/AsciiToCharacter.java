package Day2;
import java.util.Scanner;
public class AsciiToCharacter {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		char[] a=new char[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			}
		for(int i=0;i<n;i++) {
		a[i]=(char)arr[i];
		}
		System.out.print(a);
}
}