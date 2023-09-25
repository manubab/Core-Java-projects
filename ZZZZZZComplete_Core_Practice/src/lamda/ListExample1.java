package lamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@FunctionalInterface
interface Operation {
	void process(List<List<Integer>> ob);
}
public class ListExample1 implements Operation {
	static List <List<Integer>> ob;

	public  void process(List<List<Integer>> ob) {
		this.ob = ob;

		List<Integer> list1 = Arrays.asList(1, 2, 3);
		List<Integer> list2 = Arrays.asList(4, 5, 6);
		List<Integer> list3 = Arrays.asList(7, 8, 9);
		List<List<Integer>> listOfGroup = Arrays.asList(list1, list2, list3);
		Object ob1= listOfGroup.stream().collect(Collectors.toList());
		List<String> o=Arrays.asList(ob1.toString());
	     
		
		

	}
	
	
	
	public static void main(String[] args) 
	{
		ListExample1 list=new ListExample1();
		
		list.process(ob);
		
	}

}


//public static void main(String[] args) {
//
//	
//	
//	List<Integer> list1 = Arrays.asList(1, 2, 3);
//	List<Integer> list2 = Arrays.asList(4, 5, 6);
//	List<Integer> list3 = Arrays.asList(7, 8, 9);
//
//	List<List<Integer>> listOfGroup = Arrays.asList(list1,list2,list3);
//
//	new Operation() {
//
//		public void process(List<List<Integer>> ob) {
//			
//			List<Integer> list1 = Arrays.asList(1, 2, 3);
//			List<Integer> list2 = Arrays.asList(4, 5, 6);
//			List<Integer> list3 = Arrays.asList(7, 8, 9);
//
//			List<List<Integer>> listOfGroup = Arrays.asList(list1,list2,list3);
//			
//			ob.addAll(listOfGroup);
//
//			ob.forEach(System.out::println);
//
//		}
//	}.process();
//
//}