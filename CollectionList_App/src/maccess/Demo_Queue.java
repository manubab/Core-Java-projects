package maccess;
import java.util.*;
public class Demo_Queue {

	@SuppressWarnings("removal")
	public static void main(String[] args) {
		PriorityQueue<Integer> ob=new PriorityQueue<Integer>();
		ob.add(new Integer(10));
		ob.add(new Integer(11));
		ob.add(new Integer(12));
		ob.add(new Integer(13));
		ob.add(new Integer(14));
		ob.add(new Integer(15));
		ob.add(new Integer(16));
		
		System.out.println(ob.toString());
		
		ob.remove();
		System.out.println(ob.toString());
		System.out.println(ob.poll());
		System.out.println(ob.toString());
		
	
		System.out.println(	ob.element());
		
		System.out.println(ob.peek());

	


		
 		

	}

}
