package practice;
import java.util.*;

import java.util.function.*;

import java.util.function.BiPredicate;
public class BiPredicateDemo2 {
	
	
	boolean equalsObject(String s1,String s2)
	{
		if(s1.equals(s2))
		{
			System.out.println(s2);
			return true;
		}
		System.out.println("Objects are not Equal"+s1);
		return false;
	}
	
	public static void main(String[] args)
	{
		BiPredicateDemo2 ob=new BiPredicateDemo2();
		
		BiPredicate<String,String> bp=ob::equalsObject;
		
		bp.test("manu", "Manu");
	}

}
