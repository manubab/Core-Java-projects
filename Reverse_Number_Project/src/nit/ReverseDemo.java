package nit;
import java.util.Scanner;

import test.ReverseNumber;

public class ReverseDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter input value");
		int n=sc.nextInt();
		ReverseNumber rn=new ReverseNumber();
		int result=rn.rev(n);
		System.out.println("result :"+ result);
		sc.close();
		
		
		
	
		
		
		
	}

}
