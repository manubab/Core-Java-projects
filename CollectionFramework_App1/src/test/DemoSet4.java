napackage test;
import java.util.*;
public class DemoSet4 {
	public static void main(String[] args) {
		LinkedHashSet<Integer> ob1=new LinkedHashSet<>();
		ob1.add(11);
		ob1.add(12);
		ob1.add(13);
		System.out.println(ob1.toString());
		
		LinkedHashSet<Integer> ob2=new LinkedHashSet<>();
		ob2.add(21);
		ob2.add(22);
		ob2.add(23);
		System.out.println(ob2.toString());
		LinkedHashSet<Integer> ob3=new LinkedHashSet<>();
		ob3.add(31);
		ob3.add(32);
		ob3.add(33);
		System.out.println(ob3.toString());
	
		System.out.println("\n** Using addAll() **");
		ob1.addAll(ob2);
		System.out.println(ob1.toString());
		
		ob1.retainAll(ob3);
		System.out.println(ob1.toString());
		
		ob1.removeAll(ob2);
		System.out.println(ob1.toString());
		ob2.clear();
		System.out.println(ob2.toString());
		
	}

}
