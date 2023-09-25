package maccess;
import test.*;
import java.util.*;
public class DemoObject2 {
	public static void main(String [] args)
	{
		Employee1 ob1=new Employee1();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id :");
		ob1.id=sc.nextLine();
		System.out.println("Enter name :");
		ob1.name=sc.nextLine();
		System.out.println("Enter desg :");
		ob1.desg=sc.nextLine();
		System.out.println("Enter city :");
		ob1.ad.city=sc.nextLine();
		System.out.println("Enter state :");
		ob1.ad.state=sc.nextLine();
		
		System.out.println("***** object data *****");
		System.out.println(ob1.toString());
		System.out.println(ob1.ad.toString());
		
		System.out.println("**** before cloned hashCode() **** :");
		System.out.println(ob1.hashCode());
		System.out.println(ob1.ad.hashCode());
		
		ob1.gerRef1();
		
		System.out.println("***** Cloned data *****");
		System.out.println(ob1.toString());
		System.out.println(ob1.ad.toString());
		
		System.out.println("*** after Cloned hashCode() ***");
		System.out.println(ob1.hashCode());
		System.out.println(ob1.ad.hashCode());
	}

}
