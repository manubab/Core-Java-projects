package nit.nit;

import java.util.Scanner;

import test.TestPrime;


public class PrimeDemo {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		TestPrime p1=new TestPrime();
		System.out.println("Enter your value");
		p1.prime(s.nextInt());
		
		
	}
	

}
