package String_Practice;
import java.util.*;
public class Capitalise_Characters {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String :");
		String input = sc.nextLine();
		String output = "";
		for (int i = 0; i < input.length(); i++) {
			char currentChar = input.charAt(i);
			if (i == 0 ||input.charAt(i-1)==' ') {
				output += Character.toUpperCase(currentChar);
			} else {
				output += currentChar;
			}
		}
		System.out.print("New String is :" + output);
		sc.close();
	}

}
