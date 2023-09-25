package practice;
import java.util.function.*;
public class PredicateDemo1 {
	
	static boolean calVal(int val)
	{
		if(val<10) {
			return false;
		}
			return true;
	}
	
	public static void main(String[] args) {
		
		Predicate<Integer> pr= PredicateDemo1::calVal;
		
		boolean b=pr.test(12);
		
		System.out.println(b);
	}

}
