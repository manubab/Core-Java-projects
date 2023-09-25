package maccess;
import test.*;
import java.util.*;

public class Demo_Bank_Atm_Model_Design_Model_1 {
	public static void main(String[] args) {
		//ATM project

		Scanner sc=new Scanner(System.in);
		int count=0;
		abc:
		while(true) {
		System.out.println("Enter  pin number : ");
		int pin=sc.nextInt();
		if(pin>1000&&pin<9999) {
			CheckPin cpn=new CheckPin();
		  boolean b = cpn.checkpin(pin);
		  if(b) {
			  System.out.println("===choice====");
			  System.out.println("\t1.WithDraw "+"\n2.Deposit"+"\n3.Check balence");
			  System.out.println("Enter choice :");
			  switch(sc.nextInt()) {
			  case 1:
				  System.out.println("Enter amt :");
				  int wamt=sc.nextInt();
				  ITest ob1=Access.withdraw();
				 ob1.process(wamt);
				  break abc;
			  case 2:
				  System.out.println("Enter amt :");
				  int damt=sc.nextInt();
				  ITest ob2=Access.deposit();
				 ob2.process(damt);
				  
				  break abc;
			  case 3:
				  Balence bal=new Balence();
				  System.out.println("balence :"+bal.getBal());
				  break abc;
				  default:
					  System.out.println("invalid choice...");
			  }
			  
		  }else {
			  System.out.println("inCurrect Pin...!");
			  count++;
		  }
			
		}else {
			System.out.println("invalid pin...!");
			count++;
		}
		if(count==3) {
			System.out.println("Trasection bloked..!");
			break;
		}
		
		}//while end
		
		
	}

}
