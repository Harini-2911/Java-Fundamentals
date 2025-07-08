package Day2;
import java.util.Scanner;
public class FindingElement {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			int[] arr=new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
			}
			int a=sc.nextInt();
			for(int i=0;i<n;i++) {
				if(arr[i]==a) {
					System.out.print(i);
					return;
				}
			}
			System.out.println("-1");
		}
	}
