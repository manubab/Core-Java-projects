package maccess;
import java.util.*;
public class DemoDeque {
	@SuppressWarnings("removal")
	public static void main(String[] args) {
		LinkedList<Integer> ob=new LinkedList<Integer>();
		ob.add(new Integer(100));
		ob.add(new Integer(132));
		ob.add(new Integer(123));
		ob.add(new Integer(103));
		ob.add(new Integer(108));
		ob.add(new Integer(108));
		ob.add(new Integer(178));
		
		System.out.println(ob.toString());
		ob.addFirst(12);
		System.out.println(ob.toString());
		ob.addLast(21);
		System.out.println(ob.toString());
		ob.remove();
		System.out.println(ob.toString());
		
		ob.removeFirst();
		System.out.println(ob.toString());
		ob.removeLast();
		System.out.println(ob.toString());
		ob.pollFirst();
		System.out.println(ob.toString());
		ob.pollLast();
		System.out.println(ob.toString());
		
		System.out.println(ob.getFirst());
		System.out.println(ob.getLast());
		
		
		Iterator<Integer> it=ob.iterator();
		it.forEachRemaining((k)->{
			System.out.print(k+" ");
		});
		
		Iterator<Integer> it2=ob.descendingIterator();
		it2.forEachRemaining((k)->{
			System.out.print("\n"+k+" ");
		});
		
		ob.removeFirstOccurrence(108);
		System.out.println(ob.toString());
		ob.removeLastOccurrence(108);
		System.out.println(ob.toString());
		



		

	}

}
