package test;

public class Electricity_Bill  {
	public String CName;
	public int Cid;
	public  int mr;
	public int pmr;
	public int uc;
	public double bAmt;
	public void cuC() {
		uc=mr-pmr;	
	}
	public void calBill() {
		double urate=7.5;
		bAmt=uc*urate;
	}
	public void genarateBill()
	{
		System.out.println("cName :"+CName);
		System.out.println("Cid :"+Cid);
		System.out.println("mr :"+mr);
		System.out.println("pmr :"+pmr);
		System.out.println("uc :"+uc);
		System.out.println("bAmt :"+Math.abs(bAmt));
		
	}
	

}
