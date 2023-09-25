package test;
import java.util.*;

public class Testing {
	public static void main(String[] args) {
		
		Object [] arr= {12,"manu","Raju",23,45};
		
		List ob=new ArrayList(Arrays.asList(arr));
		
		List<Object> ob1=new LinkedList<Object>(ob);
		
		ob.remove(3);

		
		ob.forEach((i)->System.out.println(i));
		
		
		
	}

}
