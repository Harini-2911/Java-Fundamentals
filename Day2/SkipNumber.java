package Day2;
import java.util.Scanner;
public class SkipNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		int s=0;
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			}
		int sum=0;
		for(int i=0;i<n;i++) {
		if(arr[i]==6) {
			s=1;
			continue;
		}
		if(arr[i]==7 && s==1) {
			s=0;
			continue;
		}
		if(s==0) {
			sum+=arr[i];
		}
	}
System.out.print(sum);
}
}