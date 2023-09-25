package practice;

import java.util.*;
import java.util.function.BiConsumer;
public class BiConsumerDemo2 {

	void showDetails(Map<Integer,String> map,String mapName)                                                           
	{
		System.out.println("-----------"+mapName+" records-------------");
		
		map.forEach((k,v)->System.out.println(k+"  "+v));
		
	}
	
	public static void main(String[] args) {
		BiConsumerDemo2 bc=new BiConsumerDemo2();
		Map<Integer,String> map=new HashMap<>();
		
		map.put(12, "mohan");
		map.put(110, "Sujeet");
		map.put(11, "raju");
		
		BiConsumer<Map<Integer,String>,String> bi=bc::showDetails;
		
		bi.accept(map, "Student");
	}

}
