package practice;

import java.util.*;
import java.util.stream.*;

public class Demo_Stream 
{
	@SuppressWarnings("removal")
	public static void main(String[] args) 
	{
		
		Stream strStream =Stream.of("welcome","To,","java","blog");
		
		Stream subStream2=strStream.map(s->{
			if(s=="java")
			{
				return "java-w3schools";
				
			}
			return s;
		});
		
		Object wecomelist=subStream2.collect(Collectors.toList());
		
		System.out.println(wecomelist);
		
		Stream.of("one","two","three","four","five").skip(2).forEach(item->System.out.println(item));
		
		
		Stream.of("one","two","three","four","five").limit(2).forEach(item->System.out.println(item));
		
		
	}

}
