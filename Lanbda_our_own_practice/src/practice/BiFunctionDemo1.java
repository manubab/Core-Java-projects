package practice;

import java.util.function.*;
public class BiFunctionDemo1 {
	
	public static void main(String[] args) {
		
		BiFunction<Integer,Integer,Integer> bf=(a,b)->a+b;                                                                                              
		
		
		
		System.out.println(bf.apply(10, 12));
	}
}
