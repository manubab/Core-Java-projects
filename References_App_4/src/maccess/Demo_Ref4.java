package maccess;
import java.util.*;
import test.*;
public class Demo_Ref4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 Contact c=new Contact();
		Employee e=new Employee(c);
		
		System.out.print("Enter employee id :");
		e.id=sc.nextLine();
		System.out.print("Enter employee name :");
		e.ename=sc.nextLine();
		System.out.print("Enter Employee Desg :");
		e.desg=sc.nextLine();
		System.out.print("Enter EMPmailid :");
		e.ob.mailid=sc.nextLine();
		System.out.print("Enter EMPphno :");
		e.ob.phno=sc.nextLong();
		
		
		
		System.out.println(e.toString());
		sc.close();
		
		
		
		
		

	}

}
