package test;

public class DemoCon2 {
	public String name, mailid;
	public long phno; 
	
	public DemoCon2(String a,String b,long c) {
		name=a;
		mailid=b;
		phno=c;
		
		System.out.println("===display userdetails====");
		System.out.println("user name : "+name);
		System.out.println("user mailid"+ mailid);
		System.out.println("user phno"+phno);
		
	}


}
