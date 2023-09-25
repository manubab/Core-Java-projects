package test;

//wap to read and display Customer details using Constructor concept?
//(id,name,city,mailId,phNo)



public class CTest3 {
	public int cid;
	public String name,city,mailid;
	public long phno;
	
	
	public CTest3(int a,String b,String c,String d,long e){
		cid=a;
		name=b;
		city=c;
		mailid=d;
		phno=e;
	}
	public void getCDetails() {
		System.out.println("**Customer id : "+ cid);
		System.out.println("**Cname : "+ name );
		System.out.println("**CityName : "+ city);
		System.out.println("**Mailid :"+ mailid);
		System.out.println("**phno : "+ phno);
	}
	

}
