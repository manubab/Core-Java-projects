package String_Practice;
import java.util.*;
public class First_Duplicate_Character {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String :");
		String s=sc.nextLine();
		String ns="";
		
		for(int i=0;i<s.length();i++)
		{
			
			for(int j=i+1;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					ns=ns+s.charAt(j);	
					break;
				}	
			}
		}
		System.out.println(ns.charAt(0));

	}

}
