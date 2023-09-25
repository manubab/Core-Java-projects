package String_Practice;

import java.util.Arrays;

public class ArrayCopy {
	public static void main(String[] manu)
	{
		int[] arr= {1,2,4,5,7,8,10,12,3,6};
		
		int narr[] =new int[arr.length];
		
		for(int i=0;i<arr.length;i++)
		{
			narr[i]=arr[i];
			
			System.out.print(narr[i]+" \n");
		}
		Arrays.sort(narr);
		
		for(int i:narr)
		{
			if(i%2==0)
			{
				System.out.print(i +" ");
			}
		}
		
		
		
	}

}
