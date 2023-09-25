package String_Practice;
import java.util.*;
public class Character_Repalce {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String :");
		String s=sc.nextLine();
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			
			char u=Character.toUpperCase(c);
			if(u=='A') {
				System.out.println(u);
			}
		}
	}
}
