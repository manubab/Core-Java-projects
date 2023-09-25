package com.test.sw;

public class Nested_blocks {
	public static void main(String[] args) {
		try {
			System.out.println(" outer try bloc*k...");
			int a=10/0;
//			try {
//				System.out.println("         inner try block...");
//				//int a=10/0;
//			}
//			catch(StringIndexOutOfBoundsException e)
//			{
//				System.out.println("        inner catch block...");
//				
//			}
//			finally {
//				System.out.println("           inner finally block");
//			}
//			
		}
		catch(Exception e)
		{
			System.out.println(" outer catch block...");
			
			System.out.println(e.toString());
			try {
			System.out.println("ram".charAt(5));
			}catch(Exception e1) {
				System.out.println(e1.toString());
				
			}
		}
		finally {
			System.out.println(" outer finally block");
		    try {
			int [] a=new int[-1];
		    }
		    catch(Exception e2) {
		    	System.out.println(e2.toString());
		    }
		}
	}

}
