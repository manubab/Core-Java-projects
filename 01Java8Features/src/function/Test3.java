package function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test3 {
	public static void main(String[] args) {

		Test3 ob = new Test3();

		List<String> list = Arrays.asList("node", "c++", "java", "javascript");                                  
		
		
//		List<String> result=ob.map(list);
//		result.forEach(System.out::println);
				
			
				
		
	}

	private <T,R>List<R> map(List<T> list, Function<T,R> func) {
		
		List<R> result=new ArrayList<>();
		
		for(T t:list)
		{
			result.add(func.apply(t));
		}
		return result;
	}
	
	public String sha256()
	{
		return "";
	}

}
