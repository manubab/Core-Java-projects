package MyProject;
import java.util.*;
import java .util.Scanner;

public class A{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String ");
		String s=sc.nextLine();
		String[] s1=s.split(" ");
		System.out.println(s1.length);
		
		String S="java raju java";
		String S1="java java java";
		System.out.println(s.codePointAt(5));
		System.out.println(s.codePointBefore(4));
		System.out.println(s.codePointCount(2, 8));
		System.out.println(s.compareTo(S1));System.out.println(s.concat(S1));
		System.out.println(s.contains(S1));
		System.out.println(s.contentEquals(S1));
		System.out.println(s.isBlank());
		System.out.println(s.indent(6));
		System.out.println(s.indexOf('j'));
		System.out.println(s.indexOf("raju"));
		System.out.println(s.replaceAll(S1, s));
		
		String str="    ";
		System.out.println(str.length());
		
		Map m=new HashMap();
		Map m1=new LinkedHashMap();
		System.out.println(m1.entrySet());
		m.put('a', 1);
		System.out.println(m);
		Set s2=new HashSet();
		
				
		
	}
	
	
	
	
}
