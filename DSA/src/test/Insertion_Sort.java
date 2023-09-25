package test;

import java.util.Arrays;


public class Insertion_Sort {
	
	static void insertionSort(int arr[])
	{
		int size=arr.length;
		
		for(int a=1;a<size;a++)
		{
			int k=arr[a];
			int j=a-1;
			
			while(j>=0&& k<arr[j])
			{
				arr[j+1]=arr[j];
				--j;
			}
			arr[j+1]=k;
			
		}
	}
	public static void main(String[] args) {
		
		int [] arr= {9,4,0,1,6,3};
		
		insertionSort(arr);
		
		System.out.println("Sorted Array in Asending order:");
		System.out.println(Arrays.toString(arr));
		
	}
	
		
	
	
}
