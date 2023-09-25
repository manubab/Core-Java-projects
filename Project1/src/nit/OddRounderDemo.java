package nit;

import java.util.Scanner;

import test.OddRound;

public class OddRounderDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter input");
		int a=sc.nextInt();
		OddRound or=new OddRound();
		int result=or.oddRounder(a);
		
		System.out.println("result"+ result);
		
	}

}
