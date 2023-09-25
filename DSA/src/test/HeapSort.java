package test;
import java.util.*;
public class HeapSort {

	public void sort(int []arr)
	{
		int n=arr.length;
		
		// build max heap
		for(int i=n/2-1;i>=0;i--)
		{
			heapify(arr,n,i);
		}
		
		// heap sort
		for(int i=n-1;i>=0;i--)
		{
			int temp=arr[0];
			arr[0]=arr[i];
			arr[i]=temp;
			
			//heapify root element
			heapify(arr,i,0);
		}
	}
	
	

	public void heapify(int[] arr, int n, int i)
	{
		//finding among left child and right child
		
		int largest=i;
		int l=2*i+1;
		int r=2*i+2;
		
		if(l<n&&arr[l]>arr[largest])
			largest=l;
		if(r<n&&arr[r]>arr[largest])
			largest=r;
		
		// swap and continue heapfying if the root is not largest 
		
	if(largest!=i)
	{
		int swap=arr[i];
		arr[i]=arr[largest];
		arr[largest] =swap;
		
		heapify(arr,n,largest);		
	}
		
		
	
	}
	//function to print an array
	static void printArray(int arr[])
	 {
		int n=arr.length;
		
		for(int i=0;i<n;i++) 
		{
			System.out.println(arr[i]+" ");
			System.out.println();
		}
		 
	 }
	public static void main(String[] args) 
	{
		int arr[]={1,12,9,5,6,10};
		
		HeapSort hs=new HeapSort();
		hs.sort(arr);
		
		System.out.println("Sorted array is :");
		printArray(arr);
		
	}

}
