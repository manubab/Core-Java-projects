package practice;

import java.util.function.*;

public class FunctionDemo2 {
	
	public static void main(String[] args)
	{
		Function<Integer,String> fun=(num)->
		{
			if(num %2==0)
			{
			  return "Number"+num+"is Even";	 
			}
			else
			{
				return "Number"+num+"is Odd";
			}
		};
		System.out.println(fun.apply(15));
	}

}
