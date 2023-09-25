package test;

// 3)=> spy number sum its digits equal the product of the digits eg : 123=1+2+3=1*2*3;

import java.util.Scanner;

public class Test2 {

	
	public static void main(String[] args) {
		int prod = 1;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number :");
		int n = sc.nextInt();
		int m=n;
		while (n != 0) {
			int d = n % 10;
			sum = sum+ d;
			prod = prod * d;
			
			n=n/10;
		}
		if (prod == sum) {
			System.out.println("Spy number");
		} else {
			System.out.println("not Spy numbers");
		}

	}

}
