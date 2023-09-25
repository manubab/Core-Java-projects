package session2;

import java.io.IOException;
import java.io.*;

public class patterns 
{
	 public static void main(String[] args) throws IOException
	 {
		 System.out.println("Enter the n value :");
		 
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int n=Integer.parseInt(br.readLine());
		
//		for(int i=0;i<n;i++)
//		{
//			for(int j=0;j<n;j++)
//			{
//				 System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
		
		for(int i=n;i>=1;i--)
		{
			for(int j=n;j>=i;j--)
			{
				System.out.print("x");
			}
			System.out.println();
		}
		
		
		
		
		
		
	}
}
