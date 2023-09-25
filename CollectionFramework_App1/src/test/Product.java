package test;

public class Product extends Object implements Comparable {
	public String code,name;
	public float price;
	public int qty;
	public Product(String code, String name, float price, int qty) {
		this.code = code;
		this.name = name;
		this.price = price;
		this.qty = qty;
	}
	public String toString() {
		return code+"\t"+name+"\t"+price+"\t"+qty;
	}
	public int compareTo(Object o) {
		Product p=(Product)o;// Down Casting 
		int pc=code.compareTo(p.code);
		if(pc==0) {
			return 0;
		}else if(pc>1){
			return 1;
			
		}else {
			return -1;
		}
	}
	
	

}
