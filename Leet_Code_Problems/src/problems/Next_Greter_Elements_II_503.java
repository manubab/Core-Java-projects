package problems;
import java.util.*;

public class Next_Greter_Elements_II_503
{
	public static int[] nextGreaterElements(int[] nums)
	{
		int n=nums.length;
		
		int[] output_Arr=new int[n];
		
		Arrays.fill(output_Arr, -1);
		
		Stack<Integer> stack=new Stack<>();
		
		for(int i=0;i<n*2;i++)
		{
			while(!stack.isEmpty()&&nums[stack.peek()]<nums[i%n])
			{
				output_Arr[stack.pop()]=nums[i%n];	
			}
			if(i<n)
				stack.push(i);
		}
		
		return output_Arr;
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int x=sc.nextInt();
		
		int[] arr=null;
		
		System.out.println(Arrays.toString(arr));
		
	}

}
