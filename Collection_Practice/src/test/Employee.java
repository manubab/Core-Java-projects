package test;

import java.util.*;

public class Employee 
{
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesg() {
		return desg;
	}

	public void setDesg(String desg) {
		this.desg = desg;
	}

	public float getSal() {
		return sal;
	}

	public void setSal(float sal) {
		this.sal = sal;
	}

	public String id,name,desg;
	public  float sal;
	
	public Employee(String id,String name,String desg,float sal)
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
	



	
	
	

}
