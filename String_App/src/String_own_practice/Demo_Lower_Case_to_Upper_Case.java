package String_own_practice;
import java.util.*;
public class Demo_Lower_Case_to_Upper_Case {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String :");
		
		String x=sc.nextLine();
		char a[]=x.toCharArray();
		int size=a.length;
	    char b[]=new char[size];
		
		int i=0;
		while(i!=size)
		{
			a[i]=(char)(a[i]+32);
			++i;
			
		}
		System.out.println(a);
		
		
	}

}
