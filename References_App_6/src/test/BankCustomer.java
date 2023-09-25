package test;

public class BankCustomer {
	public String accno,aHName,accType;
	public float bal;
	public Address a=new Address();
	public Contact c=new Contact();
	
	public String toString() {
		return accno+" :\t"+aHName+" :\t"+accType+" :\t"+bal+a.toString()+":"+"\t"+c.toString();
	}
	

}
