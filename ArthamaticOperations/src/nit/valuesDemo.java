package nit;
import java.util.Scanner;

import Test.Values;
public class valuesDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter input");
		int n=sc.nextInt();
		Values v=new Values();
		int sign=v.findSign(n);
		System.out.println(sign);
	}

}
