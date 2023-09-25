package maccess;
import java.util.*;
interface Area1{
	
	void Circle();
	
	interface volume{
		void semi_circle();
	}
}



public class InnerInterface implements Area1{
	
	public void volume() {
		System.out.println("****Using Outer Interface****");
		
		
		
	}

	public static void main(String[] args) {
		System.out.println("**** Using Inner Interface****");
		InnerInterface I=new InnerInterface();
		I.volume();
		I.Circle();

	}

	@Override
	public void Circle() {
		System.out.println( "i came From Outer to right ");
		
	}

	
	

}
