package nit;

import java.util.Scanner;
import test.Test;

public class Demo_String2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the branch");
		String s = sc.nextLine().toUpperCase();
		Test t1 = new Test();
		boolean br = t1.getBranch(s);
		if (br) {
			System.out.println("branch : " + br);
			System.out.println("valid branch");
		} else {
			System.out.println("invalid branch");
		}

		sc.close();

	}

}
