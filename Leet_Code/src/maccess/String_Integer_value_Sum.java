package maccess;
import java.util.Scanner;
public class String_Integer_value_Sum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The String :");
		int sum=0;
		String s=sc.nextLine();
		
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
		     int n=(int)c;
			if(n>=48&&n<57)
			{
				String s1=String.valueOf(c);
				int p=Integer.parseInt(s1);
				sum+=p;
			}
		}
		System.out.println("No of Sum "+sum);
	}

}
