package maccess;



// Write a to read String and display the Separately based on vowels and Consonants ....

// i/p => E.g : Book is on the table 

// O/P => Words starts with vowels : is on
//     => words starts with consonants : book the table
import java.util.*;
public class DemSotringTokenizer4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String :");
		String str=sc.nextLine();
		StringTokenizer st=new StringTokenizer(str, " ");
		String a="";
		while(st.hasMoreElements()) {
			String s=st.nextToken();
			char c=s.charAt(0);	
			
			switch(c) {
			case 'A':
			case 'a':
				break;
			}
		
			
		}
	}
}
