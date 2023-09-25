package functionalInterfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


class Emp{
	
	private static String companyName;
	private String employeeId;
	private String employeeName;
	private String employeeAddress;
	private static String companyAddress;
	
	public static String getCompanyName() {
		return companyName;
	}
	public static void setCompanyName(String companyName) {
		Emp.companyName = companyName;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeAddress() {
		return employeeAddress;
	}
	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}
	public static String getCompanyAddress() {
		return companyAddress;
	}
	public static void setCompanyAddress(String companyAddress) {
		Emp.companyAddress = companyAddress;
	}
	
	public String toString()
	{
		return companyName+" :" +employeeName+" :" +employeeId+" :"  +employeeAddress +" :" +companyAddress;
	}

	public Emp(String employeeId, String employeeName, String employeeAddress) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeAddress = employeeAddress;
	}
	
	
	
	public Emp() {
	}
	
	
	
	
	
}
interface Predicate<T>{
	
	 boolean test(T t);
}


public class Employee1
{
	public static void main(String[] args)
	{
		
		List<Emp> listOfEmps=new ArrayList<>();
		
		Emp ob1=new Emp();
		
		ob1.setEmployeeAddress("kurnool");
		ob1.setEmployeeId("A111");
		ob1.setEmployeeName("Manu");
		ob1.setCompanyName("Manu private limited");
		ob1.setCompanyAddress("Q city,hyderabd");
		
		
		
	    listOfEmps.add(ob1);
	    
	    listOfEmps=Arrays.asList(new Emp("Ravi123","ravi","Penchi"),
	    		                 new Emp("Tiru123","tiru","pathikonda"),
	    		                 new Emp("Praveen123","praveen","guntakal"),
	    		                 new Emp("Raju123","Raju","Betamcharla"),
	    		                 new Emp("arjun123","arjun","Kolkatha"),
	    		                 new Emp("Madhu123","madhu","hyd")                  
	    		                 );

	    
	   
	 
	
	}

}
