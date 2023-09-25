package maccess;
import java.util.*;
import java.util.Map.Entry;

public class DemoTest {
	@SuppressWarnings({ "rawtypes" })
	public static void main(String[] args) {
		Map<Integer,String> m=new HashMap<>();
		m.put(101, "Manu");
		m.put(111, "Raj");
		m.put(121, "Mom");
		m.put(131, "Dad");
		m.put(101, "anu");
		
		System.out.println(m.toString());
		System.out.println(m.keySet());
	    System.out.println(m.containsKey(121));
	    System.out.println(m.containsValue("anu"));
	    System.out.println(m.entrySet());
      	System.out.println(m.values());
		for(Map.Entry entry : m.entrySet())
	    {
		System.out.println(entry.getKey()+"  "+entry.getValue());
	       }
		
		Set s=m.entrySet();
		Iterator it=s.iterator();
		
		while(it.hasNext())
		{
	     Map.Entry entry=(Entry) it.next();
	     
	     System.out.println(entry.getKey()+"  "+entry.getValue());
		}
	}

}
