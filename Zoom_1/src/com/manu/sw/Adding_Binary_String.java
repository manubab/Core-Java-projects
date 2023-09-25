package com.manu.sw;

public class Adding_Binary_String {
	public static void main(String[] args) {
		
		int a=20;
		int b=30;
		
		String s1=Integer.toBinaryString(a);
		String s2=Integer.toBinaryString(b);
		
	int c=Integer.parseInt(s1,2);
	int d=Integer.parseInt(s2,2);
  
	 int e=c+d;
	 String s3=Integer.toBinaryString(e);
	 
	 System.out.println(Integer.toBinaryString(e));
	 
	
	 
	 System.out.println(Integer.parseInt(s3,2));
	 
	 
	 
	 // another way 
	 
	 class Solution {
		    public String addBinary(String a, String b) {
		        return new java.math.BigInteger(a, 2).add(new java.math.BigInteger(b, 2)).toString(2);
		    }
		}
		
		
	}

}
