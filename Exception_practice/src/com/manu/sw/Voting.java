package com.manu.sw;
import com.test.sw.InvalidAgeException;

import java.util.*;
public class Voting {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Age");
		int age=sc.nextInt();
		InvalidAgeException ime=new InvalidAgeException();
		
		try {
			ime.AgreeOrNot(age);
		} catch (InvalidAgeException e) {
			InvalidAgeException im=new InvalidAgeException("your age not aligible");
		System.out.println(im.getMessage());
		}
		

	}

}
