package Day2;
import java.util.Scanner;
public class LargestSmall2 {
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
		System.out.println("Smallest:"+arr[0]+" "+arr[1]);
		System.out.println("Largest:"+arr[n-1]+" "+arr[n-2]);
	}
}
