package test;



// write a program to read and display all products where price >1000

public class Products {
	public String pcode,pname;
	public int price;
	public  Products(String pcode,String pname,int price) {
		this.pcode=pcode;
		this.pname=pname;
		this.price=price;
	}
	public String toString() {
		return  pcode+"\t"+pname+"\t"+price;
	}
	
	

}
