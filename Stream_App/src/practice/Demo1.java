package practice;
import java.util.stream.*;
import java.util.*;
public class Demo1 {
	public static void main(String[] args) {
		
		String[] arr={"manu","sai","amma","rajan"};
		
		Stream<String> ob=Stream.of(arr);
		
		Spliterator<String> it=ob.spliterator();
		
		
		
	ob.filter((k)->k.length()>3);
	
	System.out.println(ob);
	
	
		
	}

}
