package maccess;
import java.util.*;
import java.util.function.Predicate;
public class Linked {

	@SuppressWarnings("removal")
	public static void main(String[] args) {
		LinkedList<Integer> ob=new LinkedList<Integer>();
		ob.add(new Integer(11));
		ob.add(new Integer(10));
		ob.add(new Integer(15));
		ob.add(new Integer(13));
		ob.add(new Integer(17));
		ob.add(new Integer(19));
		ob.add(new Integer(12));
		ob.add(new Integer(16));
		{
	Predicate<Integer> pr=(T)->T<14;
	
	 ob.forEach((k)->{
		System.out.println(k);
	 });
	
    

		
		}
	}
	    

	


}
