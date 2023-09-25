package practice;
import java.util.function.*;
public class ConsumerDemo1 {
	
	static void printMessage(String name)
	{
		System.out.println("Hello "+name);
		
	}
	
	static void printInt(int val)
	{
		System.out.println(val);
		
	}
	public static void main(String[] args) {
		
		Consumer<String> c=(name)->{
			System.out.println(name.length());
		};
		
		c.accept("raju kanna");
		
		Consumer<Integer> c2=ConsumerDemo1::printInt;
		c2.accept(12);
		c2.accept(35);
		
	}
}
