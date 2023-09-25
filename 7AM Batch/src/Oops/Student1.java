package Oops;

class S {
	private String name;
	private int RollNo;
	private String stdid;
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNo() {
		return RollNo;
	}
	public void setRollNo(int rollNo) {
		RollNo = rollNo;
	}
	public String getStdid() {
		return stdid;
	}
	public void setStdid(String stdid) {
		this.stdid = stdid;
	}
	

}
public class Student1{
	public static void main(String[] args) {
		S s=new S();
		s.setName(   "raju");
		s.setRollNo( 11);
		s.setStdid(  "4543");
		
		
		System.out.println("Student name"+s.getName());
		System.out.println("Student roll no"+ s.getRollNo());
		System.out.println("Student stdid"+ s.getStdid());
	}
	
}
