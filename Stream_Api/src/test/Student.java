package test;

public class Student {
	public String sid;
	public String sname;
	public String course;
	public float fees;
	
	public Student(String sid,String sname,String course,float fees)
	{
		this.sid=sid;
		this.sname=sname;
		this.course=course;
		this.fees=fees;	
	}
	public String toString()
	{
		return "sid :"+sid+"sname :"+sname+" course :"+course+" fees :"+fees;
	}

}
