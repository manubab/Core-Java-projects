package test;

public class Address1 extends Object implements Cloneable{
	public String city,state;
	
	public String toString()
	{
		return "city :"+city+" state :"+state;
	}
	public Object getRef2()
	{
		Address1 o=null;
		try {
		o=(Address1)super.clone();
		}
		catch(CloneNotSupportedException cnse)
		{
			cnse.printStackTrace();
		}
		return o;
	}

}
