package test;

import java.util.Arrays;

public class Selection_Sort
{
	public static int[] doSelectionSort(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			int index=i;
			
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<arr[index])
				{
					index=j;
				}
			}
			int smallNumber=arr[index];
			arr[index]=arr[i];
			arr[i]=smallNumber;
		}
		return arr;
		
	}
	public static void main(String[] args) {
		
		int arr[]= {10,0,23,65,78,6,50};
		
		arr=doSelectionSort(arr);
		
		System.out.println(Arrays.toString(arr));
		
		
		
	}

	

}
