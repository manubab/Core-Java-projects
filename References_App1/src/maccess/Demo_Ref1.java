package maccess;
import java.util.*;
import test.*;
public class Demo_Ref1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Employee e=new Employee();
		
		System.out.print("Enter Emp id :");
		e.id=sc.nextLine()+"\n";
        System.out.print("\nEnter the Emp ename :");
		e.ename=sc.nextLine()+"\n";
		System.out.print("\nEnter the Emp Desg :");
		e.desg=sc.nextLine();
		System.out.print("\nEnter the Emp H No : ");
		e.ad.hno=sc.nextLine()+"\n";
		System.out.print("\nEnter the Emp Streat name :");
		e.ad.sname=sc.nextLine()+"\n";
		System.out.print("\nEnter the Emp City :");
		e.ad.city=sc.nextLine()+"\n";
		System.out.print("\nEnter the Pincode :");
		e.ad.pincode=sc.nextLine()+"\n";
		
		
		System.out.println("=====Display Emp Details======");
		
		System.out.println(e.toString());
		
		
		
		
		
		
		sc.close();
	}

}
