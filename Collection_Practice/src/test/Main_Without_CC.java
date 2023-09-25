package test;
import java.util.*;

public class Main_Without_CC 
{
	public static void main(String[] args) {
		List<Integer> ob=new LinkedList<>();
		
		ob.add(5);
		ob.add(10);
		ob.add(8);
		ob.add(3);
		
		Collections.sort(ob,(n1,n2)->n1.compareTo(n2));
		
		for(int k:ob)
		{
			System.out.println(k);
		}
	
		
	}

}
