package test;

public class EmpValues {
    public String eName,eDesg;
    public int bSal;
    public double totalSal;
	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String geteDesg() {
		return eDesg;
	}

	public void seteDesg(String eDesg) {
		this.eDesg = eDesg;
	}

	public int getbSal() {
		return bSal;
	}

	public void setbSal(int bSal) {
		this.bSal = bSal;
	}

	public double getTotalSal() {
		return totalSal;
	}

	public void setTotalSal(double totalSal) {
		this.totalSal = totalSal;
	}

	public EmpValues(String eName, String eDesg, int bSal) {
		super();
		this.eName = eName;
		this.eDesg = eDesg;
		this.bSal = bSal;
		this.totalSal =bSal+(0.93f*bSal)+(0.63*bSal);
	}
    
    public String toString()
    {
    	return eName+"\t"+eDesg+"\t"+bSal+"\t"+totalSal;
    }

}
