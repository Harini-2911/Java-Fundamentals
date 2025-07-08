package Day2;
import java.util.Scanner;
public class PrintGender {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int age=sc.nextInt();
		if(s.equals("Female")) {
		if(age>=0 && age<=58) {
			System.out.print("8.2%");
		}
		else if(age>=59 && age<=100) {
			System.out.print("9.3%");
		}
		}
		else if(s.equals("Male")){
			if(age>=1 && age<=58) {
				System.out.print("8.4%");
			}
			else if(age>=59 && age<=100) {
				System.out.print("10.5%");
			}
		}
}
}
