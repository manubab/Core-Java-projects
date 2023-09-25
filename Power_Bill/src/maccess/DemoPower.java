package maccess;
import java.util.*;
import test.*;

public class DemoPower extends Exception{
	public DemoPower(String msg) {
		super(msg);
	}
	public static void main(String[] args) throws DemoPower {
		try {
		Scanner sc=new Scanner(System.in);
		Electricity_Bill ob=new Electricity_Bill();
		
		System.out.println("Enter cName:");
		ob.CName=sc.nextLine();
		
		System.out.println("Enter Cid:");
		ob.Cid=Integer.parseInt(sc.nextLine());
		if(!(ob.Cid>1000&&ob.Cid<=9999)) 
		{
			throw new DemoPower("invallid Cid....!");
		}
		
		System.out.println("Enter mr:");
		ob.mr=Integer.parseInt(sc.nextLine());
		if(ob.mr<0&&ob.mr<=500) 
		{
			throw new DemoPower("invaliid mr ...!");
			
		}
		
		System.out.println("Enter pmr:");
		ob.pmr=Integer.parseInt(sc.nextLine());
		
		
		
		ob.cuC();
		ob.calBill();
		ob.genarateBill();
		
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
