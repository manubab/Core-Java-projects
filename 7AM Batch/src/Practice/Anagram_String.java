package Practice;
import java.util.Arrays;
public class Anagram_String {
	public static void main(String[] args) {
		String s="silent";
		String s1="listen";
		
		s.replace(" ", "");
		s1.replace(" ", "");
		s=s.toLowerCase();
		s1=s1.toLowerCase();
		char[] x=s.toCharArray();
		char[] y=s.toCharArray();
		
		
		
		Arrays.sort(x);
		Arrays.sort(y);
		
		Boolean result=Arrays.equals(x, y);
		
		if(result==true) {
			System.out.println("Strings are anagram");
			
		}else {
			System.out.println("Strings are not anagaram");
		}
	
}
	
	
}
