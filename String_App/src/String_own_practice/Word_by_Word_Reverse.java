package String_own_practice;
import java.util.*;
public class Word_by_Word_Reverse {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter sentence :");
		String sentence=sc.nextLine();

		String[] words=sentence.split(" ");
		String revsen="";
		for(String s: words) {
			String revword="";
			for(int i=s.length()-1;i>=0;i--) {
				revword=revword+s.charAt(i);
			}
			revsen=revsen+revword+" ";
		}
		System.out.println("rev sentence :"+revsen);
	}

}
