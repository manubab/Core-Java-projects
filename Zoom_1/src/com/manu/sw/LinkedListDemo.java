package com.manu.sw;
import java.util.function.*;
import java.util.*;
public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList<Integer> ll=new LinkedList<>();
		ll.add(12);
		ll.add(22);
		ll.add(32);
		ll.add(42);
		ll.add(15);
		ll.add(12);
		ll.add(14);
		ll.add(123);
		ll.add(23);
		ll.add(45);
		ll.add(54);
		ll.add(78);
		ll.add(89);
		
		System.out.println(ll);
		
		Predicate<Integer> pr=(k)->k<40;
		System.out.println("====Elements>25====");
		ll.forEach((z)->{
			if(pr.test(z))
			{
				System.out.println(z+" ");
			}
		});


	}

}
