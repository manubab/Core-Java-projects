package practice;

import java.util.function.Function;



public class FunctionDemo1 {
	public static void main(String[] args)
	{
		Function<String,Integer> fun=(t)->t.length();
		System.out.println(fun.apply("manu"));
	}

}
