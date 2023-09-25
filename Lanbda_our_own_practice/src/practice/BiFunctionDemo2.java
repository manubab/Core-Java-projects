package practice;
import java.util.*;
import java.util.function.*;
public class BiFunctionDemo2 {
	
	public static void main(String[] args) {
		
		Map<Integer,String> map=new HashMap<Integer,String>();
		
		map.put(12, "manu");
		map.put(14, "bhaskar");
		map.put(16, "raju");
		
		BiFunction<Integer,String,String> bi=(k,v)->k+"  "+Collections.frequency(map.values(), v);                                               
		
		map.forEach((k,v)->System.out.println(k+" "+v));
		
	}

}
