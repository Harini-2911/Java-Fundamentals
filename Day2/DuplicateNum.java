package Day2;
import java.util.Scanner;
public class DuplicateNum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			}
		int i;
		for(i=0;i<n;i++) {
			int c=0;
			for(int j=0;j<i;j++) {
				if(arr[i]==arr[j]) {
					c=1;
					break;
				}
			}
			if(c==0) {
                 System.out.print(arr[i] + " ");
				}
		}
}
		}