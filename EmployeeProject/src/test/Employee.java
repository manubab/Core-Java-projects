package test;

import java.io.*;

public class Employee implements Serializable {
	private String id;
	private String name;
	private String desg;
	private double sal;

	public Employee(String id, String name, String desg, double sal) {
		this.id = id;
		this.name = name;
		this.desg = desg;
		this.sal = sal;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDesg(String desg) {
		this.desg = desg;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDesg() {
		return desg;
	}

	public double getSal() {
		return sal;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", designation=" + desg + ", salary=" + sal + "]";
	}


}
