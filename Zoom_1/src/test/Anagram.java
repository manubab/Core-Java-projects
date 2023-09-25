package test;
import java.util.*;
public class Anagram {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first String ...!");
		String s1=sc.nextLine();
		System.out.println("Enter second String....!");
		String s2=sc.nextLine();
		
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		
		char[] c1=s1.toCharArray();
		char[] c2=s2.toCharArray();
		
	Arrays.sort(c1);
	Arrays.sort(c2);
	boolean b=Arrays.equals(c1, c2);
	
	if(b=true) {
		System.out.println("anagram");
	}else {
		System.out.println("not anagram");
	}
	
		
	}

}
