package maccess;
import java.util.*;
public class Remove_Dubblicate_Element_Sorted_Array {
	
	public static void main(String[] args) {
		 
		Integer []arr= {12,13,21,11,43,23,12,21,89,90};
		
		Arrays.sort(arr);
		
		List<Integer> ob=Arrays.asList(arr);
		
//		Set<Integer> ob2=new HashSet<Integer>(ob);
		
//		ob2.forEach((k)->{
//			System.out.println(k.toString());
//		});

		Object[] arr1=ob.toArray();
		
//		for(Object n:arr1)
//		{
//			System.out.println(n);
//		}
//		
		
		List<Integer> list= Arrays.asList(arr);
		
		
		
		Set<Integer> ob4=new HashSet<Integer>();
		
//		list.stream().filter(e->!ob4.add(e))
//		.forEach(System.out::println);
		
		
		ob.stream().distinct().forEach(System.out::println);
		
		
		
		
	}
}
	
	
	
//	 public static int removeDublicate(int[] nums) {
//		
//		 Arrays.sort(nums);
//		 
//		 int j=1;
//		 
//		 for(int i=0;i<nums.length;i++)
//		 {
//			 if(!(nums[i-1]==nums[i])) {
//				 nums[j]=nums[i];
//				 j++;
//			 }
//		 }
//		 
//		return j;




class Solution {
    public int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]< 9){
             digits[i]++;
             return digits;}
            digits[i]=0; }
        digits = new int[digits.length+1];
        digits[0]=1;
        return digits; }}

		 
	 


