package test;
import java.util.Comparator;
public class EmployeeComparator implements Comparator<Employee>                             
{
	public int compare(Employee e1,Employee e2)
	{
		int result=e1.getId().compareTo(e2.getId());
		
		if(result==0)
		{
			return e1.getDesg().compareTo(e2.getDesg());
		}
		if(result==0)
		{
			return e1.getName().compareTo(e2.getDesg());
					
		}
		
		return result;

	}
	
}
