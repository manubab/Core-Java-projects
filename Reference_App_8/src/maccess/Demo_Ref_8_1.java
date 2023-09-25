package maccess;

import test.*;
import java.util.*;

public class Demo_Ref_8_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number BankCustomers :");
		int n = Integer.parseInt(sc.nextLine());
		BankCustomer[] b = new BankCustomer[n];
		System.out.println("Enter the " + n + " Number Details :");
		for (int i = 0; i < b.length; i++) {
			System.out.println("Enter the " + (i + 1) + " Cutomer Details :");
			b[i] = new BankCustomer();
			System.out.println("Enter the AccNo :");
			b[i].AccNo = Long.parseLong(sc.nextLine());
			System.out.println("Enter the Ahn :");
			b[i].Ahn = sc.nextLine();
			System.out.println("Enter the AccType :");
			b[i].AccType = sc.nextLine();
			System.out.println("Enter the bal :");
			b[i].bal = Float.parseFloat(sc.nextLine());
			System.out.println("Enter the Customer HNo:");
			b[i].a.Hno = sc.nextLine();
			System.out.println("Enter the Street Name :");
			b[i].a.sname = sc.nextLine();
			System.out.println("Enter the City name :");
			b[i].a.city = sc.nextLine();
			System.out.println("Enter the State Name :");
			b[i].a.state = sc.nextLine();
			System.out.println("Enter the pincode :");
			b[i].a.pincode = Integer.parseInt(sc.nextLine());
			System.out.println("Enter mailId :");
			b[i].c.mailid = sc.nextLine();
			System.out.println("Enter phNo :");
			b[i].c.phno = Long.parseLong(sc.nextLine());
		}
		System.out.println("=====Display BankCustomer Details =====");

		for (BankCustomer ob : b) {
			System.out.println(ob.toString());
		}
	}

}
