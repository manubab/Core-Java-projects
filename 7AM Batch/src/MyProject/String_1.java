package MyProject;
import java.util.Scanner;

public class String_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Stirng : ");
		String s = sc.nextLine();
		int len = s.length();
		int indexOf = s.indexOf("java");
		if (len == -1) {
			System.out.println("java not found");

		} else {
			System.out.println("found");
		}

	}

}
