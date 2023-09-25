package Practice;

public class Student {
	private int sid;
	private String sname;
	
	public void setName(String sname) {
		
	}
	public void setValue(int sid) {
		
	}
	Student(int sid,String sname){
		this.sid=sid;
		this.sname=sname;
		
		
	}
	public String getName() {
		return sname;
	}
	public int getValue() {
		return sid;
	}
	public static void main(String[] args) {
		Student s1=new Student(101,"manu");
		int Sid=s1.getValue();
		String Sname=s1.getName();
		
		System.out.println("Student id : "+ Sid);
		System.out.println("Student Sname : "+Sname);
	}
	
	

}
