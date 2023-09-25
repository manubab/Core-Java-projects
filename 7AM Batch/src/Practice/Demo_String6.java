package Practice;

import java.util.Scanner;

public class Demo_String6 {
	public static void main(String[] args) {
		String j = "Java";
		String p = "programming";
		String l = "Language";
		String full = j + p + l;
		System.out.println("Total Strings : " + full.toString() + "\n");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String-1 : ");
		String s1 = sc.nextLine();
		System.out.println("Enter the String-2");
		String s2 = sc.nextLine();
		System.out.println("================using equals()========================== ");
		boolean b1 = s1.equals(s2);
		if (b1) {
			System.out.println("valid");
		} else {
			System.out.println("invalid");
		}
		boolean b2 = s1.equalsIgnoreCase(s2);
		if (b2) {
			System.out.println("valid ");
		} else {
			System.out.println("invlid");
		}
		System.out.println("====using====");
		int c1 = s1.compareTo(s2);
		if (c1 == 0) {
			System.out.println("Strings are equal");
		} else if (c1 < 0) {
			System.out.println(s1 + "is less than : " + s2);
		} else if (c1 > 0) {
			System.out.println(s1 + "is greater value : " + s2);
		}
	}

}
