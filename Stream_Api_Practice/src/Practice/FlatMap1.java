package Practice;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMap1 
{
	public static void main(String[] args) {
		
	
	List<String> ob=Arrays.asList("5.6","7.9","9.0","1","3.4");
	
	//ob.stream().flatMap(e->Stream.of(e)).forEach(System.out::println);
	
	List<String> a=ob.stream().map(e->e.concat("manu")).collect(Collectors.toList());
	
	//System.out.println(a);
	
	
	List<Integer> in=Arrays.asList(1,2,3,2,1,4,5);
	
	
	in.stream().distinct().forEachOrdered(System.out::println);
	
	}
	
	
	

}
