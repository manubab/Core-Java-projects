package maccess;
import test.*;
import java.util.*;
public class Demo_Ref7 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Address a=new Address();
		Contact c=new Contact();
		BankCustomer bc=new BankCustomer(a, c);
		System.out.println("===Display Bank Customer Details :");
		System.out.print("\nEnter the Acno :");
		bc.AccNum=sc.next();
		System.out.print("\nEnter the AHN :");
		bc.Ahn=sc.next();
		System.out.print("\nEnter the bal:");
		bc.bal=sc.nextFloat();
		System.out.print("\nEnter the AccType :");
		bc.AccType=sc.next();
		System.out.print("\nEnter Acc Holder HNO:");
		bc.a.Hno=sc.next();
		System.out.print("\nEnter the Street name :");
		bc.a.sname=sc.next();
		System.out.print("\nEnter the City :");
		bc.a.city=sc.next();
		System.out.print("\nEnter the State :");
		bc.a.state=sc.next();
		System.out.print("\nEnter the pincode :");
		bc.a.pincode=sc.nextInt();
		System.out.print("\nEnter the mailid :");
		bc.c.mailid=sc.next();
		System.out.print("\nEnter the phno :");
		bc.c.phno=sc.nextLong();
		System.out.println(bc.toString());
	}

}
