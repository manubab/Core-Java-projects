package test;
public class Employee {
	public String id,name,desg;
	public Contact ob;
	public Employee(Contact c) {
		ob=c;
		
	}
	public String toString() {
		return id+"\t"+name+"\t"+desg+"\t"+ob.mailid+"\t"+ob.phno;
	}

}
