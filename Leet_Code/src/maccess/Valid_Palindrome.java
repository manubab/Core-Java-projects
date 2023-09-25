package maccess;
import java.util.*;

public class Valid_Palindrome {
	
	
	private static boolean validPalindrome(String s,String ns) {
		if(s.equals(ns))
		{
			return true;
		}
		return false;
		
	}
	public static void main(String[] args) {
		String s="A mom A";
		String s1=s.toLowerCase().replace(" ", "");
		System.out.println(s1);
		
		System.out.println(validPalindrome(s,s1));
	}
	
		

}
