package nit;

import test.DemoCon2;
import java.util.Scanner;

public class MainCon2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the user name");
		String un=sc.nextLine();
		System.out.println("Enter the user mailid");
		String mid=sc.nextLine();
		System.out.println("Enter the user phno :");
		long phno=sc.nextLong();
		
		DemoCon2 dc=new DemoCon2(un,mid,phno);
		System.out.println(dc);
		sc.close();
		
	}

}
