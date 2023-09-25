package test;
import java.util.StringTokenizer;
import java.util.StringJoiner;
public class String_Joiner {
	
	public static void main(String[] args) {

		
		StringJoiner ob=new StringJoiner("/");
		ob.setEmptyValue("Object is empty...!");
		
		
		ob.add("Manu ");

		
		ob.add("Java Coder...!");
		
 		
		System.out.println(ob);
	}

}
