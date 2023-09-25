package practice;
import java.util.*;
import java.util.function.*;

public class FunctionDemo4 {
	public static void main(String[] args)
	{
		List<String> list=Arrays.asList("banana","margo","Apple","watermelon");
		
		Map<String,Integer> map=convertListtoMap(list,x->x.length());
		
		System.out.println(map);
	}

	private static Map<String, Integer> convertListtoMap(List<String> list, Function<String,Integer> func) {
		
		Map<String,Integer> result=new HashMap<>();
		
		for(String s:list)
		{
			result.put(s, func.apply(s));
		}
		
		return result;
	}

}
