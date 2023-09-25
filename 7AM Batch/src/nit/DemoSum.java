package nit;
import java.util.Scanner;

import test.Sum;
public class DemoSum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number");
		int n=sc.nextInt();
		if(n>0) {
			Sum s=new Sum();
		int sum1=s.sum(n);
		System.out.println("Sum :"+ sum1);
			
		}else {
			
			
		}
		
	}

}
