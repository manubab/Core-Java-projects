package test;
import java.util.*;
public class Booble_Sort 
{
	static void bubbleSort(int []arr)
	{
		int size=arr.length;
		int temp=0;
		for(int i=0;i<size-1;i++)
		{
			for(int j=0;j<size-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
				}
			}
			
		}
	}

	public static void main(String[] args) 
	{
		int []arr= {-2,45,0,11,-9}; 
		
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
	}

}
