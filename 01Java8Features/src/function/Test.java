package function;


interface Function<T,R>
{
	
	R apply(T t);
}


public class Test
{
	
	public static void main(String[] args) {
		
		Function<String,Integer> fanc=x->x.length();
		
		Integer apply=fanc.apply("Manu Ur great");
		System.out.println(apply);
	}

}




