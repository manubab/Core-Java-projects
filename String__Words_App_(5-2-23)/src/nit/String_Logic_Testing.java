package nit;

import java.util.Scanner;

import test.String_Logic;

public class String_Logic_Testing {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s=sc.nextLine();
		
		String_Logic s1= new String_Logic();
		String w=s1.cal(s);
		System.out.println(w);
	
	
		
		
	}

}
