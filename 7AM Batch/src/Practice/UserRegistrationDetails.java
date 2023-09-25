package Practice;

public class UserRegistrationDetails {
	String uname;
	String pswd;
	String fname;
	String lname;
	String address;
	String mailid;
	long phno;
	
	
	void URD() {
		System.out.println("URD uname : "+ uname);
		System.out.println("URD pswd : "+ pswd);
		System.out.println("URD fname :" +fname);
		System.out.println("URd lname : "+ lname);
		System.out.println("URD Address : " +address );
		System.out.println("URD mailid : "+ mailid);
		System.out.println("URD phno : " + phno);
	}
	public static void main(String[] args) {
		UserRegistrationDetails URD=new UserRegistrationDetails();
		URD.uname="manu";
		URD.pswd="T.manu@123";
		URD.fname="Manohar";
		URD.lname="Thalari";
		URD.address="4-134 penchikalapadu (v) gudur (m) kurnool(d)";
		URD.mailid="manuprofessonal43@gmail.com";
		URD.phno=6301514150l;
		
		URD.URD();
		
	}

}
