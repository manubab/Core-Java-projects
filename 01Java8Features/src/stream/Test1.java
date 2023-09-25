package stream;

class Emp{
	
	 String name;
	String branch;
	 int id;
	@Override
	public String toString() {
		return "Emp [name=" + name + ", branch=" + branch + ", id=" + id + "]";
	}
	 
	 
	 
}


public class Test1
{
	public static void main(String[] args) {
		
		Emp ob1=new Emp();
		
		ob1.name="manu";
		ob1.branch="penchi";
		ob1.id=120;
		
		System.out.println(ob1);
		
		Emp ob2=ob1;
		
		System.out.println("----------------------------------------------");
		
		ob1.branch="kurnool";
		
		ob2.branch="Nandyal";
		
		System.out.println(ob1);
		System.out.println(ob2);
	}

}
