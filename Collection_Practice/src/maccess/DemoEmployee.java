package maccess;
import java.util.*;

import test.Employee;
import test.EmployeeComparator;
public class DemoEmployee 
{
	@SuppressWarnings("unchecked")
	public static void main(String [] args)
	{
		LinkedList<Employee> ob=new LinkedList<Employee>();
		
		ob.add(new Employee("A123", "MANU", "JE", 3500));
		ob.add(new Employee("A120", "RAVi", "CJ", 4000));
		ob.add(new Employee("A127", "TIRU", "ME", 5400));
		ob.add(new Employee("A111", "PRAVEEN", "PD", 2400)); 
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the EID :");
		String eId=sc.nextLine();
		System.out.println("Enter Ename:");
		String eName=sc.nextLine();
		
		//ob.removeIf(e->e.getId().equals(eId));
		
		//System.out.println(ob.toString());
		
		
//		for(Employee e:ob)
//		{
//			if((e.getId()==eId)||e.getName().equals(eName))
//			{
//				System.out.println(e.toString()+"Ur Employee Object");
//				break;
//			}else
//			{
//				System.out.println(e.toString());
//				
//			}
//		}
		
		int totSalOfAllEmployee=0;
		
		for(Employee e:ob)
		{
			totSalOfAllEmployee+=e.getSal();
			
	
		}
		System.out.println(totSalOfAllEmployee);
		
		
			
		

		
		
		
		
		
		
	}
	

}
