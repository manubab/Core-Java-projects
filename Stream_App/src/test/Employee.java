package test;
import java.io.Serializable;
public class Employee implements Serializable
{
	
	private String eId;
	private String eName;
	private String eDesg;
	private double eSal;
	
	
	public String geteId() {
		return eId;
	}
	public void seteId(String eId) {
		this.eId = eId;
	}
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
	public double geteSal() {
		return eSal;
	}
	public void seteSal(double eSal) {
		this.eSal = eSal;
	}
	public Employee(String eId, String eName, String eDesg, double eSal) {
		this.eId = eId;
		this.eName = eName;
		this.eDesg = eDesg;
		this.eSal = eSal;
	}
	
	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + ", eDesg=" + eDesg + ", eSal=" + eSal + "]";
	}
	

}
