package string;
                      
                                 //Hello num=4 output
                 
                         //a b  c d e f g h i j k l m n o p q r s t u v w x y z 
import java.util.Scanner;
public class Test_1
{
	
	int n2;
	
	public static int Caeser_Crep(String str,int num)
	{
		if(num==4)
		{
			for(int i=0;i<str.length();i++)
			{
				char c=str.charAt(i);
				
				int n1=(int)c;
				
				int n2=n1+c;
				
				char c1=(char)n2;
				
				StringBuffer sb=new StringBuffer();
				sb.append(c1);
				
				System.out.println(sb.toString());
				
			
				
				
			}
			return num;
			
				
		}else
			if(num==0)
				return num;
		
		
		
		return num;
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the String :");
		String s=sc.nextLine();
		System.out.println("Enter the integer :");
		int num=sc.nextInt();
		Caeser_Crep(s,num);
		
	}

}
