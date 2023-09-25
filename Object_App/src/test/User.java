package test;

public class User {
	public String name,mailId;
	
	public User(String name,String mailId)
	{
		this.name=name;
		this.mailId=mailId;
		
	}
	
	public String toString()
	{
		return "name :"+name+" mailId :"+mailId;
	}

}
