package nit;
import java.util.Scanner;

import Test.Even;
public class ArthamaticDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		Even e=new Even();
		int evenorodd=e.even(n);
		System.out.println(evenorodd);
	}

}
