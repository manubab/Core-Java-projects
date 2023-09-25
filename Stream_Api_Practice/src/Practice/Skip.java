package Practice;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Skip
{
	public static void main(String[] args) {
		
	
	List<Integer> list=Stream.of(1,2,3,4,5,6,7,8,9).skip(6).collect(Collectors.toList());
	
	System.out.println(list);
	
	}
	
}
