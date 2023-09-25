package maccess;
import java.util.*;
import test.*;
public class Demo_Ref5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Contact c=new Contact();
		Employee e=new Employee(c);
		System.out.print("Enter the Number of Employee Details :");
		int n=Integer.parseInt(sc.nextLine());
		Employee[] a=new Employee[n];
		System.out.print("\nEnter "+ n+" Number of Employee Details :\n");
		for(int i=0;i<a.length;i++) {
			a[i]=new Employee(new Contact());
			System.out.print("\nEnter "+(i+1)+" employee Details :\n ");
			System.out.print("\nEnter the Employee id : ");
			a[i].id=sc.next();
			System.out.print("\nEnter the Employee Name :");
			a[i].name=sc.next();
			System.out.print("\nEnter Employee desg :");
			a[i].desg=sc.next();
			System.out.print("\nEnter Employee Mailid :");
			a[i].ob.mailid=sc.next();
			System.out.print("\nEnter Employee phno :");
			a[i].ob.phno=sc.nextLong();
		}
		System.out.println("\nDisplay All Employee Detils :");
		
		for(Employee E: a) {
			System.out.println(E.toString());
		}
		
		

	}

}
