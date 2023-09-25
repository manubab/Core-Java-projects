package test;

import java.util.*;

public class Convert_Integer_to_Binary {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Integer : ");
		Integer num=sc.nextInt();
		
		System.out.println("Binary :"+Integer.toBinaryString(num));
		
		System.out.println("Enter Binary Number :");
		String s=sc.next();
		
		System.out.print("Decimal :"+Integer.parseInt(s,2));
		
		

	}

}
