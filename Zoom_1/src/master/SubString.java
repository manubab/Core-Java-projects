package master;
import java.util.*;
public class SubString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String smallest="";
		String largest="";
		String s=sc.nextLine();

		s=s.substring(s.length()-3, s.length());
		 smallest=s;
		for(int i=0;i<s.length()-1;i++) {
			s=s.substring(s.length()-3,s.length());
			 largest=s;
		}
		
		System.out.println(smallest);
		System.out.println(largest);
	
	}

}
