package test;

//4)=>special number sum of digits and product of digits equal to given number,

// Eg => 59=5+9+5*9;

import java.util.*;

public class Test3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number  : ");
		int n = sc.nextInt();
		int m = n;
		int sum = 0;
		int prod = 1;
		while (n != 0) {
			int d = n % 10;
			prod = prod * d;
			sum = sum + d;
			n = n / 10;
		}
		if (m == (prod + sum)) {
			System.out.println("Special number");
		} else {
			System.out.println("is not special number");
		}

	}

}
