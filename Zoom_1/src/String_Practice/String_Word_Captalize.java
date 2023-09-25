package String_Practice;
import java.util.*;

public class String_Word_Captalize {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String :");
		String s=sc.nextLine();
		String ns="";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(i==0||i-1==' ')
			{
				ns=ns+Character.toUpperCase(c);
			}
			else {
				ns=ns+c;
			}
		}
		System.out.println(ns);

	}

}
