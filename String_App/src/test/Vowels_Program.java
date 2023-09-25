package test;

/** write a java program to read and count the following;
 * 
 * read input String s="java 17 version by 2021 and which is its";
 * 
 * count of vowels;
 * count of consonants;
 * count of numbers ;
 * count of others;
 * 
 * main methods in String class 
 * length();
 * charAt();
 * indexOf();
 * 
 * 
 * @author T.manohar
 */


public class Vowels_Program {
	
	public static void main(String[] args) {
		String s = new String("java 17 version by 2021 which is its ");
		for (int i = 0; i <= s.length() - 1; i++) {
			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
					|| s.charAt(i) == 'u' || s.charAt(i) == ' ') {
				System.out.println(s.charAt(i) + " : vowels");
			} else {
				s.charAt(i);
				System.out.println(s.charAt(i) + ": consonent");
			}
		}

	}
	
	
		
		
		
	
	

}
