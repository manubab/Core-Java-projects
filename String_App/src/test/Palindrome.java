package test;

import java.util.Scanner;

public class Palindrome {
	static String rev = "";

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
		String s = sc.nextLine();
		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		if (rev.equals(s)) {
			System.out.println("palindrome String");

		} else {
			System.out.println("its not ");
		}

	}

}
