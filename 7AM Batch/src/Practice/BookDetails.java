package Practice;

public class BookDetails{
	int code;
	String name;
	String author;
	float price;
	int qty;
	
	
	void getBookDeatils(){
		System.out.println("Book code : "+ code);
		System.out.println("Book name : "+ name);
		System.out.println("Book author :"+ author);
		System.out.println("Book price : "+ price);
		System.out.println("Book qty : "+ qty);
		
		
	}
	
	public static void main(String[] args)throws Exception {
		BookDetails bd=new BookDetails();
		bd.code=102;
		bd.name="java 8th edition";
		bd.author="James Gousling";
		bd.price=123.23f;
		bd.qty=12;
		bd.getBookDeatils();
		
		System.out.println(bd.getClass().getName());
		
	}
}