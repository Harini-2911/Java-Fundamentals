package Day2;
import java.util.Scanner;
public class SortedArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int a=0,i;
		for(i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]>arr[j]) {
					a=arr[i];
					arr[i]=arr[j];
					arr[j]=a;
				}
			}
		}
		for( i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
