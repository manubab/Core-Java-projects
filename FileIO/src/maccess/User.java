package maccess;
import java.io.*;
import java.util.*;
public class User implements Serializable{
	public String uName;
	public long phNo;
	public Date dateTime;
	
	public User(String uName,long phNo,Date dateTime)
	{
		this.uName=uName;
		this.phNo=phNo;
		this.dateTime=dateTime;
		
	}
	public String toString()
	{
		return "UserName \t :"+uName+"Ph NO \t:"+phNo+"dateTime \t:"+dateTime;
	}

}
