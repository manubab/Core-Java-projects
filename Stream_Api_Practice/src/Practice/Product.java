package Practice;
import java.util.stream.*;
import java.util.*;

public class Product {
	
	int id;
	String name;
	float price;
	
	public Product(int id,String name,float price)
	{
		this.id=id;
		this.name=name;
		this.price=price;
	}

	public static void main(String[] args) {
		
		List<Product> ob=new ArrayList<>();
		
		ob.add(new Product(111,"HP Laptop",25000f));
		ob.add(new Product(222,"Dell Laptop",30000f));
		ob.add(new Product(333,"Lenovo Laptop",27000f));
		ob.add(new Product(444,"Sony Laptop",28000f));
		ob.add(new Product(555,"Apple Laptop",90000f));
		
		//ob.stream().filter(p->p.price>30000).map(p->p.price).forEach(System.out::println);
		

		Set<Float> set=ob.stream().filter(p->p.price>30000).map(p->p.price).collect(Collectors.toSet());
		
		System.out.println(set.toString());
	}
	
	

}
