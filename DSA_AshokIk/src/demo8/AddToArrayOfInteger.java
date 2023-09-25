package demo8;

import java.math.*;
import java.util.*;

public class AddToArrayOfInteger 
{
	public static void main(String[] args) 
	{
		int [] ar= {1,2,3,4,5,6,7,8,9,0};
		System.out.println(new AddToArrayOfInteger().addToArrayForm(ar,7));
		
	}
	
	public List<Integer> addToArrayForm(int[] a,int k)
	{
		StringBuilder sb=new StringBuilder();
		
		for(int c:a)
		{
			sb.append(c);
		}
		
		BigInteger big=new BigInteger(sb.toString());
		BigInteger result=big.add(BigInteger.valueOf(k));
		
		String resultStr=result.toString();
		
		List<Integer> list=new ArrayList<>();
		
		
		for(char b:resultStr.toCharArray())
		     {
			list.add(Integer.parseInt(String.valueOf(b)));
			
	        }
		return list;
		
		
	}
	
	
	

}
