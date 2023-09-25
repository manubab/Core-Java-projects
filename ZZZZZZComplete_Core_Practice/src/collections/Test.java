package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
public class Test {
	public static void main(String[] args) {
		List<List<Integer>> listOfGroup = new ArrayList<>();

		List<Integer> list1 = Arrays.asList(1, 2, 3);
		List<Integer> list2 = Arrays.asList(4, 5, 6);
		List<Integer> list3 = Arrays.asList(7, 8, 9);
		listOfGroup.addAll(Arrays.asList(list1, list2, list3));
		List<Integer> o = new ArrayList<>();
		
		for (List<Integer> ob : listOfGroup) {
			o.addAll(ob);
			System.out.println(o.toString());
		}

		
	//	listOfGroup.stream().forEach(e->e.stream().forEach(System.out::print));
		
	}

}
