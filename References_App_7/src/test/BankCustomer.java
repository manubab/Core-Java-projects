package test;

public class BankCustomer {
	public String AccNum,Ahn,AccType;
	public float bal;
	public Address a;
	public Contact c;
	
	public BankCustomer(Address ad,Contact cc) {
		a=ad;
		c=cc;
	}
	public String toString() {
		return  "\n AccountNumber :"+AccNum+"\n"+
				"\n AccountHolderName :"+Ahn+"\n"+
				"\n AccountType :"+AccType+"\n"+
				"\n AccountBalence :"+bal+"\n"+
				"\n H No :"+a.Hno+"\n"+
				"\n Street Name :"+a.sname+"\n"+
				"\n City name :"+a.city+"\n"+
				"\n State name: "+a.state+"\n"+
				"\n pincode :"+a.pincode+"\n"+
				"\n Mailid :"+c.mailid+"\n"+
				"\n phno :"+c.phno;
	}
	

}
