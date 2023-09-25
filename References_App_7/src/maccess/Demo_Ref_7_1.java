package maccess;
import test.*;
import java.util.*;
public class Demo_Ref_7_1 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number BankCustomers :");
		int n=Integer.parseInt(sc.next());
		 Address a=new Address();
		Contact c=new Contact();
		BankCustomer[] b=new BankCustomer[n];
		
		System.out.print("Enter the "+n+" BankCustomer Details \n ");
		
		for(int i=0;i<b.length;i++) {
			b[i]=new BankCustomer(a,c);
			
			System.out.print("\nEnter "+(i+1)+" BankAccount Details :\n");
			System.out.print("\nEnter the AccNum :");
			b[i].AccNum=sc.next();
			System.out.print("\nEnter the AccHolder Name :");
			b[i].Ahn=sc.next();
			System.out.print("\nEnter the AccType :");
			b[i].AccType=sc.next();
			System.out.print("\nEnter the bal :");
			b[i].bal=sc.nextFloat();
		    System.out.print("\nEnter the Customer HNo:");
			b[i].a.Hno=sc.next();
			System.out.print("\nEnter the Customer Street name :");
			b[i].a.sname=sc.next();
			System.out.print("\nEnter the Customer City name :");
			b[i].a.city=sc.next();
			System.out.print("\nEnter the state :");
			b[i].a.state=sc.next();
			System.out.print("\nEnter the pincode :");
			b[i].a.pincode=sc.nextInt();
			System.out.print("\nEnter the mailid :");
			b[i].c.mailid=sc.next();
			System.out.print("\nEnter the phno :");
			b[i].c.phno=sc.nextLong();
			
			
		}
		
		
		for(BankCustomer bc:b) {
			System.out.println(bc.toString());
		}
		
		
		
	}

}
