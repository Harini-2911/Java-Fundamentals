package Day2;
import java.util.Scanner;
public class SumAvg {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int sum=0;
		double avg=0;
		for(int i=0;i<n;i++) {
			sum+=arr[i];
		}
		System.out.println("sum:" +sum);
		avg=(double)sum/2;
		System.out.println("avg:" +avg);
		}
	}

