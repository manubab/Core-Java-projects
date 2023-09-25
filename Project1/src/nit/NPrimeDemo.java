package nit;
import java.util.Scanner;

import test.NPrime;
public class NPrimeDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		
		int n=sc.nextInt();
		
			NPrime p1=new NPrime();
			p1.print(n);
			sc.close();
			
			
		}
	}


