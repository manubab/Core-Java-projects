package maccess;
import java.util.*;

public class Vector_Class 
{
	@SuppressWarnings("removal")
	public static void main(String[] args) 
	{
		Stack<Integer> ob=new Stack<>();
		ob.add(new Integer(10));
		ob.add(new Integer(10));
		ob.add(new Integer(10));
		ob.add(new Integer(10));
		ob.add(new Integer(10));
		
		ob.add(5, 30);
		
		
		ob.push(new Integer(10));

		System.out.println(ob.toString());
		
		ob.pop();
		System.out.println(ob);
		
		Spliterator<Integer> e=ob.spliterator();
		
		e.forEachRemaining((l)->System.out.println(l));
		
		Comparator.reverseOrder();
		
		
	}
	
}
