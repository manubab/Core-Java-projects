package nit;
import java.util.Scanner;

import Test.LeastNumber;
public class LeastDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value-1");
		int a=sc.nextInt();
		System.out.println("Enter the value-2");
		int b=sc.nextInt();
		
		LeastNumber ld=new LeastNumber();
		
	int result=	ld.getLeastNum(a, b);
	System.out.println(result);
		
		
	}

}
