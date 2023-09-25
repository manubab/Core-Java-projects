package String_Practice;
import java.util.*;
public class Sum_Of_Numbers_in_a_String {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String :");
		String s=sc.nextLine();
		int sum=0;
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			
			int n=(int)c;
			if(n>=48&&n<=57)
			{
				String s1=String.valueOf(c);
				int p=Integer.parseInt(s1);
				System.out.print( p+" ");
				sum+=p;
			}
		}
		System.out.println("\n Sum of Numbers :"+sum);
	}
	

}
