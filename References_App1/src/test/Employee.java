package test;
public class Employee {
	public String id,ename,desg;
	public Address ad=new Address();
	
	public String toString() {    // Tightly Coupled Objects.....
		return "Eid :"+id+" Ename :"+ename+"desg :"+desg+ad.toString();
		
		
	}

}
