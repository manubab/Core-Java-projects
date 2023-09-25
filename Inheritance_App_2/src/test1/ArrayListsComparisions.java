package test1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListsComparisions
{
	
	
	
	
	
	
	public static void main(String[] args) 
	{
		
		 List<Object> list1 = new ArrayList<>(new Integer(10));
	        
		 list1.add(20);
		 list1.add(30);
		 list1.add(30);
		 list1.add(40);
	        
	        List<Object> list2 = new ArrayList<>(new Integer(30));
	        list2.add(40);
	        list2.add(40);
	        list2.add(40);
	        list2.add(40);
		
		 List<Integer> list= comparaLists(list1,list2);
		
		
	}

	private static List<Integer> comparaLists(List<Object> list1, List<Object> list2) {

		List<Object> ob1=new ArrayList<>();
		
		ob1=list1;
		
		List<Object> ob2=new ArrayList<>();
		ob2=list2;
		
		
		Object[] ob=ob1.toArray();
		
		Integer [] arr1=(Integer[]) ob;
		
		Integer [] arr2=arr1;
		
		
		System.out.println(Arrays.toString(arr2));
		
		
		
		
		
		return null;
	}

	
	

}
