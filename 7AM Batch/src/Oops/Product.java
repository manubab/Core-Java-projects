package Oops;

public class Product {
	int code;
	String name;
	double price;
	public static void main(String[] args) {
		Product p=new Product();
		p.code=101;
		p.name="mouse";
		p.price=234.34;
		System.out.println("product code :"+p.code);
		System.out.println("product name: "+p.name);
		System.out.println("product price: "+p.price);
		
	}

}
