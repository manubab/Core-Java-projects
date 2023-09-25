package nit;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class Demo_Map1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		HashMap m=new HashMap();
		HashMap<Integer,String> hm=new HashMap<>();
		
		
		System.out.println("********* add data into Map***********\n ");
		
		hm.put(101,"Manu");
		hm.put(102,"uma");
		hm.put(103,"Srikanth");
		
		
		
		System.out.println(hm.get(101));
		System.out.println(hm.containsKey(101));
		System.out.println(hm.containsValue("uma"));
		
		System.out.println(hm.isEmpty());
		
		System.out.println(hm.size());
		
		System.out.println(hm.keySet());
		
		System.out.println(hm.values());
		
		System.out.println( hm +" ");
		
		System.out.println(hm.size());
		
		System.out.println(m.hashCode());
		
		Hashtable t=new Hashtable();
		
		
		
		
	}

}
