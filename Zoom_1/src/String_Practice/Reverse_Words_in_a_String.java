package String_Practice;
import java.util.*;

public class Reverse_Words_in_a_String {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String :");
		String s=sc.nextLine();
		System.out.println(s);
		
		System.out.println("Words reverse...");
		
		StringTokenizer st=new StringTokenizer(s," ");
		
		while(st.hasMoreTokens()) {
		String s1=	st.nextToken();
			StringBuffer sb=new StringBuffer(s1);
			System.out.println(sb.reverse()+" i");
		}
	}

}
