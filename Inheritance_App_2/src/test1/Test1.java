package test1;


abstract class A1{
	
	A1(){
		System.out.println("0-param con");
	}
	
	A1(int a){
		this();System.out.println(a +"param con");
	
	  
	}
	
	
	public abstract void m1();
	
	
}
public class Test1 extends A1 {

	@Override
	public void m1() {
		System.out.println("Abstract method m1()");
		
	}
	
	Test1(int a){
		System.out.println( a +" Child con ");
	}
	
	public static void main(String[] args) {
		
	   new Test1(2).m1();
	   
	   new Test();
	   
	   
	   
	   
	   
	   
	}

}
