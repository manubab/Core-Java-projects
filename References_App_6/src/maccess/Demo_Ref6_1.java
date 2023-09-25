package maccess;
import test.*;
import java.util.*;
public class Demo_Ref6_1 {
	public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  System.out.print("Enter the Number of Bank Customers :");
	  int n=Integer.parseInt(sc.nextLine());
	  BankCustomer[] b=new BankCustomer[n];
	  
	  System.out.print("\nEnter "+ n+ " Number BankCustomer Details :\n");
	  for(int i=0;i<b.length;i++) {
		  b[i]=new BankCustomer();
		  System.out.println("\nEnter "+(i+1)+" Bank Customer Details :");
		   System.out.print("\nEnter the ACCNumber :");
		   b[i].accno=sc.next();
		   System.out.print("\nEnter the AHName :");
		   b[i].aHName=sc.next();
		   System.out.print("\nEnter the AccBal :");
		   b[i].bal=sc.nextFloat();
		   System.out.print("\nEnter the AccType :");
		   b[i].accType=sc.next();
		   System.out.print("\nEnter the Customer Hno :");
		   b[i].a.hno=sc.next();
		   System.out.print("\nEnter the Cusomer Street Name :");
		   b[i].a.sname=sc.next();
		   System.out.print("\nEnter the Cutomer City :");
		   b[i].a.city=sc.next();
		   System.out.print("\nEnter the Customer State :");
		   b[i].a.state=sc.next();
		   System.out.print("\nEnter the Pincode :");
		   b[i].a.pincode=sc.next();
		   System.out.print("\nEnter mail id :");
		   b[i].c.mailid=sc.next();
		   System.out.print("\nEnter the phno :");
		   b[i].c.phno=sc.nextLong();
		   
		   
		   
		 
	  }
	  for(BankCustomer bc:b) {
		  System.out.print(bc.toString()+" ");
	  }
	  
	 
	}

}
