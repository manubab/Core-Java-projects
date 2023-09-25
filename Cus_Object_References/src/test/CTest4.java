package test;

//Assignmnet-3:
//wap to read and display AddressDetails of User using Object reference
//variable Concept?

//(uName,hNo,sName,city,state,pinCode)

public class CTest4 {
	public String uName,hNo,sName,city,state;
	public int pincode;
	
	public void getUserAddress() {
		System.out.println("=============display Address=================");
		System.out.println("UserName : "+uName);
		System.out.println("User House Number :"+hNo);
		System.out.println("User Street Name : "+sName);
		System.out.println("User city name : "+city);
		System.out.println("user state name : "+state);
		System.out.println("User address pincode : "+pincode);
	}

}
