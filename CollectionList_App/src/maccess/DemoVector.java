package maccess;
import java.util.*;
public class DemoVector {
	@SuppressWarnings("removal")
	public static void main(String[] args) {
		Vector<Integer> ob=new Vector<>();
		ob.add(new Integer(12));
		ob.add(new Integer(15));
		ob.add(new Integer(16));
		ob.add(new Integer(10));
		ob.add(new Integer(18));
		ob.add(new Integer(13));
		
		ob.forEach((k)->{
			System.out.print(k+"  ");
		});
		
		ob.add(12);
		System.out.println(ob);
		
		System.out.println(ob.elementAt(5));
		
		System.out.println(ob.firstElement());
		System.out.println(ob.lastElement());
		System.out.println(ob.removeElement(12));
		System.out.println(ob);
		
		ob.insertElementAt(200, 5);
		System.out.println(ob);
		
		Enumeration<Integer> e=ob.elements();
		while(e.hasMoreElements()) 
		{
			System.out.print(e.nextElement()+" ");
			
		}
		
		System.out.println("Operation on Enumeration because asIterator() method is there ");
		
		Enumeration<Integer> e1=ob.elements();
		Iterator<Integer> i1=e1.asIterator();
		i1.forEachRemaining((k)->{
			System.out.print(k+" ");
		});
	}

}


