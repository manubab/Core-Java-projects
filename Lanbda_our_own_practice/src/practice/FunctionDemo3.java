package practice;

import java.util.function.*;

public class FunctionDemo3 {
	
	public static void main(String[] args)
	{
		Function<String,Integer> fun1=(t)->t.length();                                                      
		Function<Integer,Integer> fun2=(num)->num*2;
		
		Integer in=fun1.andThen(fun2).apply("manohar");
		
		System.out.println(in);
	}
	

}
