package practice;
@FunctionalInterface
interface ITest{
	public void m1(int a);
}

class Access
{
	public ITest getReferences()
	{
		return (int a)->{
			System.out.println("====== method m1(x) ======");
			System.out.println("The value of a:"+a);
			
		};
	}
	
}
public class Interface_Model1 {

	public static void main(String[] args) {
		
		Access ob1=new Access();
		
		ITest ob2=ob1.getReferences();
		ob2.m1(123);
	}
	

}
