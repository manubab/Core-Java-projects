package test;
import java.util.*;
public class String_Words {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s=sc.nextLine();
		String w="",r="";
		for(int i=0;i<=s.length()-1;i++) {
			char c=s.charAt(i);
			if(c!=' ') {
				w+=c;
			}
			else {
				char f=w.charAt(0);
				char I=w.charAt(w.length()-1);
				
				System.out.print(f);
				System.out.print(I);
				
			}
		}
		
	}

}
