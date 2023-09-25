package Test;
import java.util.*;

class Employee implements Cloneable {
	String name,id;
	Employee(String name,String id){
		this.name=name;
		this.id=id;
	}
	public String toString() {
		
		return "name"+name+"\n id :"+id;
	}
	         public Employee clone() 
	         throws CloneNotSupportedException
	         {
	        	 
				return (Employee)super.clone();
	        	 
	         }
	
}

public class Object_Cloneing {

	public static void main(String[] args)
	throws CloneNotSupportedException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Student name :");
		String name=sc.nextLine();
		System.out.println("Enter the Student id :");
		String id=sc.nextLine();
		Employee e=new Employee(name,id);
		System.out.println("=====Displaying CLoneable====");
		System.out.println(e);
		System.out.println("HashCode :"+e.hashCode());
		
	Employee e1=e.clone();
	System.out.println("====Displaying Dublicate Code :====");
	System.out.println(e1);
	System.out.println("HashCode :"+e1.hashCode());
	
	sc.close();
		
		
		
		

	}

}
