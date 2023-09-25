package test;

public class Product{
	public String pCode,pName;
	public float pPrice;
	public int pQty;
	
	

	public Product(String pCode, String pName, float pPrice, int pQty) {
		super();
		this.pCode = pCode;
		this.pName = pName;
		this.pPrice = pPrice;
		this.pQty = pQty;
	}

	public String getpCode() {
		return pCode;
	}

	public void setpCode(String pCode) {
		this.pCode = pCode;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public float getpPrice() {
		return pPrice;
	}

	public void setpPrice(float pPrice) {
		this.pPrice = pPrice;
	}

	public int getpQty() {
		return pQty;
	}

	public void setpQty(int pQty) {
		this.pQty = pQty;
	}
	
	@Override
	public String toString()
	{
		return pCode+"\t"+pName+"\t"+pPrice+"\t"+pQty;
	}
	

}
