package practice;
import java.util.*;
import java.util.function.*;
public class ConsumerDemo2 {
	
	static void addList(List<Integer> list)
	{
	int result=	list.stream()
		.mapToInt(Integer::intValue)
		.sum();
	}
	
	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		Consumer<List<Integer>> ob=ConsumerDemo2::addList;
		
		
		
	}
	

}
