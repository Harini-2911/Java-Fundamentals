package Day2;
import java.util.Scanner;
public class ArrayReverse {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int c=sc.nextInt();
		int[][] arr=new int[r][c];
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
			arr[i][j]=sc.nextInt();
			}
		}
			for(int i=r-1;i>=0;i--) {
				for(int j=c-1;j>=0;j--) {
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
}
}
}