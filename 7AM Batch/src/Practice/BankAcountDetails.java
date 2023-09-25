package Practice;

public class BankAcountDetails {
	private static String ifsc;
	private static String Branch;
	int balence;
	
    private String hname;
    private long AccNum;
	public static String getIfsc() {
		return ifsc;
	}
	public static void setIfsc(String ifsc) {
		BankAcountDetails.ifsc = ifsc;
	}
	public static String getBranch() {
		return Branch;
	}
	public static void setBranch(String branch) {
		Branch = branch;
	}
	public String getHname() {
		return hname;
	}
	public void setHname(String hname) {
		this.hname = hname;
	}
	public long getAccNum() {
		return AccNum;
	}
	public void setAccNum(long accNum) {
		AccNum = accNum;
	}
    
	BankAcountDetails(String ifsc,String Branch,String hname,long AccNum){
		
		this.ifsc=ifsc;
		this.Branch=Branch;
		this.hname=hname;
		this.AccNum=AccNum;
		
	}
	public static void main(String[] args) {
		BankAcountDetails bad1=new BankAcountDetails("BFB143 : ","PENCHIKALAPADU : ","Manohar : ",1234535320 );
		
		System.out.println(bad1);
		bad1.diposit(2000);
		bad1.withraw(200);
		bad1.withraw(3000);
		
		
			
		}
	public String toString() {
		return hname+Branch+AccNum+ifsc;
		
	}
	void diposit(int dipositamount) {
		balence=balence+dipositamount;
		System.out.println("diposit balence "+this.balence);
	}
	void withraw(int withdraw) {
		if(balence<0) {
			System.out.println("in sufficient amount");
		}else {
			balence=balence-withdraw;
			System.out.println("withdraw amount"+balence);
			
		}
	}
	
	

}
