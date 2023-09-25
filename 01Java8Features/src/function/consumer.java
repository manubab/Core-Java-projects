package function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class consumer
{
	public static void main(String[] args) 
	{	
		Consumer<String> print=x->System.out.println(x);
		print.accept("manu");
		
		
		List<Integer> list=Arrays.asList(1,2,3,4,5);
		
		Consumer<Integer> con=(x)->System.out.println(x);
		forEach(list,con);
		
		forEach(list,(x)->System.out.println(x));
	}

	private static <T>void forEach(List<T> list, Consumer<T> con) {
		
		for(T t:list)
		{
			con.accept(t);
			
		}
	}

}
