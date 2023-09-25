package com.test.sw;

import java.io.IOException;

public class Chaining_process extends Exception {
	//one exception class will provide another exception class 
	 //ArthematicException
	            // IOException
	         
	         // initCause(-)
	         //getCause(-)
	
	static void m1()throws Throwable
	{
		try {
			int a=10/0;
		}
		catch(Exception e) {
			//e.printStackTrace();
			
			throw e.initCause(new IOException(" We are anable to hold read and write information"));
			
		}
	}
	
	public static void main(String[] args) {
		try {
			m1();
		} catch (Throwable e) {
			System.out.println(e.getCause());
			
		}
		
	}
	
	

}
