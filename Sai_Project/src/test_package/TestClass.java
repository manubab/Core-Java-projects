package test_package;

import java.util.Scanner;

public class TestClass {
	public static int s=2;

	public static int cal(int a,int b) {
		
		   int c=a+b+s;
		  System.out.println("addition two numbe ="+c);
		return c;
	}
	public static void main(String[] args) {
		java.util.Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value");
		int a=sc.nextInt();
		System.out.println("Enter b value");
		int b=sc.nextInt();
		TestClass.cal(a, b);
		
	}

}
