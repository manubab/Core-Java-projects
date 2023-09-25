package test;
import java.util.Arrays;
public class Array_Mergeing {
	public static void main(String[] args)
	{
		
		int []arr1= {1,4,6,7,9,10};
		int [] arr2= {2,3,8,12,5};
		
		int arr3[] =new int[arr1.length+arr2.length];
		System.arraycopy(arr1, 0, arr3, 0, arr1.length);
		System.arraycopy(arr2, 0, arr3, arr1.length, arr2.length);
		
		Arrays.sort(arr3);
		System.out.println(Arrays.toString(arr3));
		
		
		
	}
	

}
