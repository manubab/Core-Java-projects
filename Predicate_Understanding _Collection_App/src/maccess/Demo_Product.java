package maccess;
import java.util.*;
import java.util.function.*;
import test.*;
public class Demo_Product {
	
	public static void main(String[] args) {
		
		List<Product> pro=new ArrayList<>();
		pro.add(new Product("A123","mouse",1200,8));
		pro.add(new Product("B121","Mobile",1400,10));
		pro.add(new Product("A321","Asus lap",43200,5));
		pro.add(new Product("C113","Redmi lap",3100,20));
		pro.add(new Product("D121","Apple",4200,20));

		
		System.out.println("Original List :");
		
		System.out.print(pro);
		
		Predicate<Product> pr=k-> k.getpQty()<15;
		
		
		pro.replaceAll(k->{
			if(pr.test(k)) {
				k.setpQty(k.getpQty()+5);
			}
			return k;
		});
		
		
		
		System.out.println(pro);
	}

}






