package maccess;
import java.util.*;
public class Demo_Collection2 {
	public static void main(String[] args) {
		System.out.println(" === print natural number ===");
		
		LinkedHashSet<Integer> ob=new LinkedHashSet<Integer>();
		for(int i=1;i<=10;i++) {
			ob.add(new Integer(i));	
		}
		System.out.print("Set<E> :"+ob);
		
		
		System.out.println("\n===Using Iteretor interface ===");
		
		Iterator<Integer> it1=ob.iterator();
		while(it1.hasNext()) {
			Integer ele=it1.next();
			if(ele%2==0) {
				System.out.print(ele+" ");
			}
		}
		
		System.out.println("\n------------Using SplIterator interface------------");
		Spliterator<Integer> sp=ob.spliterator();
		
		sp.forEachRemaining((k)->{
			if(k%2!=0) {
				System.out.print(k+" ");
			}
		});
		System.out.println("\n=======Iterator forEachRemaining============");
		Iterator<Integer> it2=ob.iterator();
		it2.forEachRemaining((z)->{
			System.out.print(z+" ");
		});
		
		}
	
}





