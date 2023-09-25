package test;

public class Employee {
	public String id,ename,desg;
	public Contact ob;
	
	public Employee(Contact c) {
		ob=c;	
	}
	    public String toString() {
		    return id+"\t"+ename+"\t"+desg+"\t"+ob.mailid+"\t"+ob.phno;
		
	}

}
