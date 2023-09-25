package maccess;

import java.util.*;
public class StringTokenizerDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter the String : ");
		String s=sc.nextLine();
		System.out.println("Enter the Break Specification");
		String dm=sc.nextLine();
		StringTokenizer t = new StringTokenizer(s,dm);
		System.out.println(" ===count String======");
		
		System.out.println("Count of Tokens : "+ t.countTokens());
		
		while(t.hasMoreTokens()) {
		         
			String s2=t.nextToken();
			
			
			System.out.println("Printing Tokens : "+ s2.toString());
			
			System.out.println("Count of Tokens : "+ t.countTokens());

		}
		sc.close();
		
		
		
		
	}

}