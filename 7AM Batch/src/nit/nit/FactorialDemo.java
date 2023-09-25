package nit.nit;
import java.util.Scanner;

import test.Factorial;
public class FactorialDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		if(n>0) {
			Factorial f=new Factorial();
			int n1=f.fact(n);
			System.out.println("num :" +n1  );
			
			
		}else {
			System.out.println("Invalid input");
		}
		sc.close();
	}

}
