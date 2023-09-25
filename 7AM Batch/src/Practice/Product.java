package Practice;

public class Product {
	int code;
	String name;
	float price;
	
	void ProductDeatils() {
		System.out.println("Product code : "+ code);
		System.out.println("Product name : "+ name);
		System.out.println("Product price : "+ price);
	}
	public static void main(String[] args) {
		Product p=new Product();
		p.code=123;
		p.name="laptop";
		p.price=2343.234f;
		
		p.ProductDeatils();
		
	}
	

}
