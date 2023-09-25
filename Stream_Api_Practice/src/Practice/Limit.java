package Practice;
import java.util.*;
import java.io.Console;
import java.util.stream.*;
public class Limit
{
	public static void main(String[] args)
	{
		Stream<Integer> ob=Stream.iterate(200, n->n/2);
		List<Integer> newList=ob.limit(10).collect(Collectors.toList());
		System.out.println(newList);
		
		
		
		
	}

}
