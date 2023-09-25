package maccess;

import java.util.Scanner;

public class Demo_String5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s = sc.nextLine();
		int len = s.length();
		int vc = 0, ac = 0, nc = 0;
		for (int i = 0; i <= len - 1; i++) {
			char c = s.charAt(i);
			switch (c) {
			case 'A':
			case 'a':
			case 'E':
			case 'e':
			case 'I':
			case 'i':
			case 'O':
			case 'o':
			case 'U':
			case 'u':
				vc++;
				break;
			}
			int ascii = (int) c;
			if ((ascii >= 65 && ascii <= 90) || (ascii >= 97 && ascii <= 122)) {
				ac++;
			}
			if (ascii >= 48 && ascii <= 57) {
				nc++;
			}
		}
		System.out.println("count of vowels : " + vc);
		System.out.println("Count of Consonents :" + (ac - vc));
		System.out.println("Count of numbers :" + nc);
		System.out.println("Count of Others :" + (len - (ac + nc)));
		sc.close();
	}
}