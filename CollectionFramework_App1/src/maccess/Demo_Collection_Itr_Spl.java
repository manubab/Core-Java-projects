package maccess;
import java.util.*;
public class Demo_Collection_Itr_Spl {
	public static void main(String[] args) {
		LinkedHashSet<Integer> ob=new LinkedHashSet<>();
		System.out.println("---Using Iterator interface---");

		for(int i=1;i<=10;i++) 
		ob.add(new Integer(i));
		
		Spliterator<Integer> sp=ob.spliterator();
		sp.forEachRemaining((k)->{
			int count=0;
			for(int j=1;j<=10;j++) {
				if(k%j==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.print(k+" ");
			}
		});
		System.out.println("---Using Iterator interface---");
		Iterator<Integer> it2=ob.iterator();
		it2.forEachRemaining((k)->{
			int count=0;
			for(int i=1;i<=10;i++) {
				if(k%i==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.print(k+" ");
			}
		});
		
	}
		
	
}









