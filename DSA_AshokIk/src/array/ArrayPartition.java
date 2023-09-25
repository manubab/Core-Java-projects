package array;

import java.util.Arrays;

public class ArrayPartition
{
	public static void main(String[] args) 
	{
		
		int[] a= {1,2,3,4,5};
		
		System.out.println(new ArrayPartition().arrayPairSum(a));
	}
	
	public int arrayPairSum(int[] nums)
	{
		Arrays.sort(nums);
		int sum=0;
		for(int i=1;i<nums.length;i++)
		{
			sum+=Math.min(nums[i-1], nums[i]);
		}	
		return sum;
	}

}



