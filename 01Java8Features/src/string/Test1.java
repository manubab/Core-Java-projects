package string;

import java.util.Scanner;

public class Test1 
{
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(modifyData("Hello",0));
	}

	private static int modifyData(String s, int num) {
		
		int n1;
		char cn;
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<s.length();i++)
		{
			if(num==4)
			{
				char c=s.charAt(i);
				int n=c;
				
				n1=n+4;
				cn=(char) n1;
				
				sb.append(cn);
				
				
				
				
				
			}
			else
				if(num==0)
				{
					return num;
				}
			
				
			
		}
		
		System.out.println(sb.toString());
		return num;
		
	}

}
