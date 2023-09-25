package maccess;
import java.util.*;
import test.*;
public class Demo_Ref6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		BankCustomer bc=new BankCustomer();
		System.out.print("Enter the ACCNum :");
		bc.accno=sc.next();
		System.out.print("\nEnter the ACCHName :");
		bc.aHName=sc.next();
		System.out.print("\nEnter the Type of Acc :");
		bc.accType=sc.next();
		System.out.print("\nEnter the Acc Bal :");
		bc.bal=sc.nextFloat();
		System.out.print("\nEnter the HNo :");
		bc.a.hno=sc.next();
		System.out.print("\nEnter the Street Name :");
		bc.a.sname=sc.next();
		System.out.print("\nEnter the City :");
		bc.a.city=sc.next();
		System.out.print("\nEnter the State :");
		bc.a.state=sc.next();
		System.out.print("\nEnter the pincode :");
		bc.a.pincode=sc.next();
		System.out.print("\nEnter the mail id :");
		bc.c.mailid=sc.next();
		System.out.print("\nEnter the phno :");
		bc.c.phno=sc.nextLong();
	    sc.close();
		System.out.println(bc.toString());
	}
}










