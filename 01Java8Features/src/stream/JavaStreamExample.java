package stream;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Product {

	int id;
	String name;
	float price;

	public Product(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

}

public class JavaStreamExample {

	public static void main(String[] args) {

		List<Product> productsList = new ArrayList<Product>();

		// Adding Products
		productsList.add(new Product(1, "HP Laptop", 25000f));
		productsList.add(new Product(2, "Dell Laptop", 30000f));
		productsList.add(new Product(3, "Lenevo Laptop", 28000f));
		productsList.add(new Product(4, "Sony Laptop", 28000f));
		productsList.add(new Product(5, "Apple Laptop", 90000f));

//        List<Float> productPriceList= productsList.stream().filter(e->e.price>30000).map(Product::getPrice).collect(Collectors.toList());
//        System.out.println(productPriceList);

		Map<Integer, String> prod = productsList.stream().collect(Collectors.toMap(p -> p.getId(), p -> p.getName()));

		System.out.println(prod);

		prod.forEach((e1, e2) -> System.out.println(e1 + e2));

		Object d1 = productsList.stream().collect(Collectors.summarizingDouble(p -> p.price));

		System.out.println(d1);

		Product p3 = productsList.stream().max((p1, p2) -> p1.price > p2.price ? 1 : -1).get();

		System.out.println(p3.getPrice());

		Product p4 = productsList.stream().min((p1, p2) -> p1.price > p2.price ? 1 : -1).get();

		System.out.println(p4.price);

		Stream.iterate(1, e1 -> e1 + 1).filter(e -> e % 3 == 0).limit(5).forEach(System.out::println);

	}

}
