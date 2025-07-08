package Day2;
import java.util.Scanner;
public class Multiples {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=1;
		int c=0;
        while(c<5) {
        	if(n%2==0 && n%3==0 && n%5==0) {
        		System.out.print(n+" ");
        		c++;
        	}
        	n++;
        }
	}
}
