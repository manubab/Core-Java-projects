package com.test.sw;

import java.util.InputMismatchException;

public class InvalidAgeException extends Exception {
	public int age;
	
	public InvalidAgeException(String msg) {
		super(msg);
	}
	public InvalidAgeException (){
		
	}
	public void AgreeOrNot(int age)throws InvalidAgeException
	{
		try {
		if(age>=18&&age<=120&&age>0)
		{
			System.out.println("Yeah ur aligible pls provide remaining details");
			
		}else {
			InvalidAgeException ime =new InvalidAgeException("invalid age");
			throw ime;
		}
		}catch(InvalidAgeException iae) {
			throw iae;
			
		}
		
		
	}
	
	

}
