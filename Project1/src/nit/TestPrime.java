package nit;

import java.util.Scanner;

import test.PrimeOrNot;

public class TestPrime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrimeOrNot p1 = new PrimeOrNot();
		System.out.println("Enter ur Value :: ");
		p1.prime(sc.nextInt());
		sc.close();
	}
	
}
