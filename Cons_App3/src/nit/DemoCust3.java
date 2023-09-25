package nit;
import java.util.Scanner;

import test.CTest3;
public class DemoCust3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Customer id");
		int a = Integer.parseInt(s.nextLine());
		System.out.println("Enter Customer name");
		String b = s.nextLine();s.nextLine();
		
		System.out.println("Enter Custommer Location");
		String c = s.nextLine();
		System.out.println("Enter Customer mailid");
		String d = s.nextLine();
		System.out.println("Enter Customer phno");
		long e = s.nextLong();
		CTest3 ct=new CTest3(a, b, c, d, e);
		System.out.println("===display c details");

		ct.getCDetails();
		s.close();

	}

}
