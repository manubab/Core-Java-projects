package maccess;

import java.util.*;

import java.util.stream.*;

class Employee implements Comparable{
	String id,name,desg;
	float sal;
	
	Employee(String id,String name,String desg,float sal)
	{
		this.id=id;
		this.name=name;
		this.desg=desg;
		this.sal=sal;
	}
	
	public String toString()
	{
		return id+" "+name+" "+desg+" "+sal;
	}

	@Override
	public int compareTo(Object o1) {
		
		Employee e1=(Employee)o1;
		
		if(sal==e1.sal)
		{
			return 4;
		}
		else return 0;
		
		
		
		
	}
	
}

public class Character_Class 
{
public static void main(String[] args)
{
	
	List<Employee> o=new ArrayList<Employee>();
	o.add(new Employee("A121","MANU","UI",100000));
	o.add(new Employee("A213","SAI","PYTHON",120000));
	o.add(new Employee("A120","MADHU","SJE",90000));
	o.add(new Employee("A132","RAVI","JE",92000));
	o.add(new Employee("A145","TIRU","TRENEE",50000));
	o.add(new Employee("A189","KAVUL","SYE",20000));
	o.add(new Employee("A102","RAM","NE",350000));
	o.add(new Employee("A321","MANASA","SAP",450000));
	o.add(new Employee("A222","MANISHA","TE",60000));
	
	
	o.forEach((l)->System.out.println(l));
	
	
	
	
	
	
	


	

	
	
	
			
		
			
		
	}
	
}
