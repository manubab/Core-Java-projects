package nit;
import Test.EvenSum;
import java.util.Scanner;

import Test.EvenSum;
public class EvenSumDemo {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your input");
		int n=s.nextInt();
		if(n>0) {
			EvenSum ev=new EvenSum();
			int sum=ev.cal(n);
			System.out.println("sum of even"+sum);
		}else {
			System.out.println("invalid input");
			
		}
		
		
				
		
		
		

	}

}
