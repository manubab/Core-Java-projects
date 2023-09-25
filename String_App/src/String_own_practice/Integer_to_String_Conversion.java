package String_own_practice;

import java.util.Scanner;

public class Integer_to_String_Conversion extends Exception {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter integer value : ");
		int a=sc.nextInt();
		String b=Integer.toString(a);
		System.out.println("Integer to String :"+b);
		
		
		System.out.println("---------------------");
		System.out.println("Enter String integer :");
		String x="1212";
		int y=Integer.parseInt(x);
		System.out.println(y);
	
		
		
	}

}
