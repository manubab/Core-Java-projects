package practice;
import java.util.function.BiConsumer;
public class BiConsumerDemo1 {
	
	static void showDetails(String name,int age)
	{
		System.out.println(name+" "+age);
	}
	
	public static void main(String[] args) {
		
		BiConsumer<String,Integer> ob=BiConsumerDemo1::showDetails;
		ob.accept("manu", 22);
        ob.accept("Commal", 23);
        
		BiConsumer<String,Integer> ob1=BiConsumerDemo1::showDetails;

		ob1.accept("mom", 35);
		ob1.accept("Dad", 45);
		
	}

}
