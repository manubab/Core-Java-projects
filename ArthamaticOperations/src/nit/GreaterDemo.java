package nit;

import java.util.Scanner;

import Test.Greatest;

public class GreaterDemo {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter numbers");
		int v1=s.nextInt();
		int v2=s.nextInt();
		Greatest g=new Greatest();
		int result=g.getGreatest(v1,v2);
		System.out.println(result);
		
		
	}

}
