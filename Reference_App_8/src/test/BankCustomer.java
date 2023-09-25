package test;

public class BankCustomer {
	public long AccNo;
	public String Ahn, AccType;
	public float bal;
	public Address a = new Address();
	public Contact c = new Contact();

	public String toString() {
		return AccNo + "\t" + Ahn + "\t" + AccType + 
				"\t" +a.toString()+"\t"+c.toString();
	}

}
