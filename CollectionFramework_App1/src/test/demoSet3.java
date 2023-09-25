package test;
import java.util.*;
public class demoSet3 {
	public static void main(String[] args) {
		LinkedHashSet<Integer>ob1=new LinkedHashSet<Integer>();
		for(int i=1;i<=10;i++)
		{
			ob1.add(new Integer(i));
			
		}
		System.out.println(ob1.toString());
		Iterator<Integer> it=ob1.iterator();
		while(it.hasNext()) {
			Integer c=it.next();
			if(c%3==0) {
				it.remove();
			}
		}
		System.out.println(ob1.toString());
		
		
		Set<Integer> ob2=Set.of(10,11,12,13,14,15);// immutable object 
		
		Object[] a=ob2.toArray();
		
		for(Object s:a)
		{
			System.out.print(s+" ");
		}
		
		
		
		
	}

}
