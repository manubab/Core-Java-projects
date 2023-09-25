package session14;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotations
{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int arr[][]=new int[3][3];
		
	/*	System.out.println("Enter the values ");
		for(int i=0;i<arr.length;i++)
		{ 
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}*/
		
		
		
		int [] a= {1,2,3,4,5,6,7,8};
		
		int []b=new int[a.length];
		int d=3;
		
		for(int i=d;i<a.length;i++)
		{
			b[i]=a[i];
		}
		
		for(int i=0;i<d;i++)
		{
			b[i]=a[i];
		}
		
		System.out.println(Arrays.toString(b));
		
		
		String s1="manu";
		String s2="  madhu";
		s1.concat(s2);
		
		
		System.out.println(s1);
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
