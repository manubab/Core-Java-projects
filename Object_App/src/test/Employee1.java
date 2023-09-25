package test;

public class Employee1 extends Object implements Cloneable{
	public String id,name,desg;
	public Address1 ad=new Address1();
	
	public String toString()
	{
		return "id :"+id+" name :"+name+" Desg :"+desg;
	}
	
	public Object gerRef1()
	{
		Employee1 o=null;
		 try {
			o=(Employee1)super.clone();
			o.ad.getRef2();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		 return o;
		
		
	}

}
