package Day2;
import java.util.Scanner;
public class MinMaxArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int min=arr[0],max=arr[0];
		for(int i=1;i<n;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
			for(int j=1;j<n;j++) {
				if(arr[j]>max) {
					max=arr[j];
				}
				
			}
		}
		System.out.print("Max:" +max+"\n"+"Max:" +min);
	}
}
