package maccess;
import java.util.Arrays;
import java.util.Spliterator;
public class Demo_Array {
	public static void main(String[] args){
		Integer a[] = {12,20,30,50,80};
		System.out.println("====old for loop =====");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		// java 5 version 
		for(Integer k: a) 
		{
			  System.out.print(k.toString());	
	  }
	Spliterator<Integer> sp=
			Arrays.spliterator(a);
	
	sp.forEachRemaining((k)->{
		System.out.print(k.toString());
		
	});
	}
}

	
	
	


	
	


      	


