package test;
import java.util.Scanner;
public class Test {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the String :");
		
		
		String s=sc.nextLine();
		System.out.println("====vowels====");
		for(int i=0;i<=s.length()-1;i++) {
			char c=s.charAt(i);
			
			switch(c) {
			case 'a':
			case 'A':
				System.out.println(c);
				break;
			
			case 'e':
			case 'E':
				System.out.println(c);
				break;
			case 'i':
			case 'I':
				System.out.println(c);
				break;
			case 'o':
			case 'O':
				System.out.println(c);
				break;
			case 'u':
			case 'U':
				System.out.println(c);
				break;
			}
		}
		sc.close();
	}

}
