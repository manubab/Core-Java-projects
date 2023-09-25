package nit;
import java.util.Scanner;

import Test.Even;
public class EvenDemo {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=s.nextInt();
		Even e=new Even();
		int even=e.even(n);
		System.out.println(even);
		
		s.close();
	}

}
