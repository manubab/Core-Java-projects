package Practice;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Peek {
	
	public static void main(String[] args) {
		
		List<Integer> ob=Arrays.asList(0,2,4,6,8,10,0,2,6);
		
		
		Stream<Integer>o=ob.stream().distinct().peek(System.out::println);
		
		List ob1=o.collect(Collectors.toList());
	
		System.out.println(ob1);
	}
	

}
