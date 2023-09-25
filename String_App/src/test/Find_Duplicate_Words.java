package test;


// * remove duplicate words in String in a program
// * print duplicate words in a String



/*public class Remove_Duplicate_Words {
	public static void main(String[] args) {
		String s=("we all are java devolopers java coders ");
		String s1=	s.replaceAll("java","");
			//s1=s.trim();
		
			System.out.println(s1);
		}
		
		
	}
*/
import java.util.Scanner;
public class Find_Duplicate_Words{
//	                      
	public static String s="i am a chandrakala";
	public static void main(String[] args) {
		
		String w="";
		for(int i=0;i<=s.length()-1;i++) {
			char c=s.charAt(i);
			System.out.print(c);
			if(c!= ' ')
				w+=c;
			else
				System.out.println(w);
				w="";
			}
		
		}
	
	}
	


