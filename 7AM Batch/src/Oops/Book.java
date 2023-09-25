package Oops;

public class Book {
	int code;
	String name;
	String author;
	double price;
	String qty;
	
	public static void main(String[] args) {
		Book b=new Book();
		b.code=463;
		b.name="java 17 th edition";
		b.author="jems Gousling";
		b.price=800;
		b.qty="13d";
		
		System.out.println("Book code :"+b.code);
		System.out.println("Book name :"+b.name);
		System.out.println("Book author :"+b.author);
		System.out.println("Book price :"+b.price);
		System.out.println("Book qty :"+b.qty);
		
		
	}

}
