package String_Practice;
import java.util.*;


public class Counting_Occurenace_Of_Characters {
	public static void main(String[] args) {
		
		String s="I am coder to develop manu Soft Private Limited";
		
		// count number of a character in a String;
	int total=	s.length();
	int ofter_remove_a = s.replace("a", "").length();
	
	int count_of_a=total-ofter_remove_a;
	System.out.println(count_of_a);
		
		
	}

}
