package nit;

import java.util.Scanner;

import test.CTest4;




//Assignmnet-3:
//wap to read and display AddressDetails of User using Object reference
//variable Concept?

//(uName,hNo,sName,city,state,pinCode)


public class UserAddressDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	
		CTest4 c=new CTest4();
		System.out.println("Enter user name");
		c.uName=sc.nextLine();
		System.out.println("Enter user HouseNo");
		
		c.hNo=sc.nextLine();
		System.out.println("Enter user Street Name");
		c.sName=sc.nextLine();
		System.out.println("Enter user city");
		c.city=sc.nextLine();
		System.out.println("Enter user State name");
		c.state=sc.nextLine();
		System.out.println("Enter user pincode");
		c.pincode=sc.nextInt();
		
		c.getUserAddress();
		
	}

}
