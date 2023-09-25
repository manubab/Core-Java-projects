package Test;

class Address {
	String hno = "3-123/h";
	String sName = "Sr Nagar";
	String city = "Hyd";

	public String toString() {
		return " HNo :" + hno + "\nsName :" + sName + "\ncity :" + city;

	}
	public Address clone()throws CloneNotSupportedException {
		return (Address)super.clone();
	}

}

class Employee1 implements Cloneable {
	String eid = "A123";
	String ename = "manu";
	Address d = new Address();

	public String toString() {
		return "eid :" + eid + "\nename :" + ename;
	}

	public Employee1 clone() 
			
			throws CloneNotSupportedException
	{
		Employee1 e = (Employee1) super.clone();
		e.d=this.d.clone();
		return e;

	}

}

public class Object_Cloning_1 {
	public static void main(String[] args)
			throws CloneNotSupportedException{

	{
		Employee1 e1 = new Employee1();
		System.out.println("----original object----");
		System.out.println(e1);
		System.out.println(e1.d);
		System.out.println("HashCode :" + e1.hashCode());
		Employee1 e2 = e1.clone();
		System.out.println("----Cloned Object----");
		System.out.println(e2);
		System.out.println(e2.d);
		System.out.println("HashCode :" + e2.hashCode());
		if (e1.d == e2.d) {
			System.out.println("Shallow clone process...");
		} else {
			System.out.println("Deep Clonening process....");
		}
	}
	}
}
