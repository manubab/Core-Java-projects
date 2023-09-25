package test;

public class User {
	public String name,mailid;
	
	public User(String name,String mailid)
	{
		this.name=name;
		this.mailid=mailid;
	}
	
	public String toString() {
		return name+"\t"+mailid;
	}

}
