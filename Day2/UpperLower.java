package Day2;
public class UpperLower {
	public static void main(String[] args) {
		char c='b';
		if(c>='A' && c<='Z') {
		char l=(char)(c+32);
		System.out.print(l);
		}
		else if(c>='a' && c<='z') {
			char l=(char)(c-32);
			System.out.print(l);
			}
}
}
