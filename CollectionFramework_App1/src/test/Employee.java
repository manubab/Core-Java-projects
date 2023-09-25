package test;
public class Employee implements Comparable {
	public String name,mailid,desg;
	
	public float sal;

	public Employee(String name, String mailid, String desg, float sal) {
		this.name = name;
		this.mailid = mailid;
		this.desg = desg;
		this.sal = sal;
		
		
	}
	public String toString() {	
		return name+"\t"+mailid+"\t"+desg+"\t"+sal;
	}
	public int compareTo(Object o) {
		Employee e=(Employee)o;
		int en=name.compareTo(e.name);
		if(en==0) {
			return 0;
		}else if(en>0) {
			return 1;
		}else {
		
		return -1;
		}
	}
}
