package mccess;
import test.*;
import java.util.*;
public class Demo_Genarics {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		// integer Genarics 
		
		Test<Integer> ob=new Test<Integer>();
		System.out.println("Enter integer value :");
		
		ob.setK(sc.nextInt());
		System.out.println("Integer value :"+ob.getK());
		
		
		Test<String> ob1=new Test<String>();
		
		ob1.setK("manu mom dad brother");
		
		System.out.println(ob1.getK());
		
		
		Test<User> ob2=new Test<User>();
		
		ob2.setK(new User("manu","@manu.com"));
		
		System.out.println(ob2.getK());
		
		

	}
}
