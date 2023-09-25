package test;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

@SuppressWarnings("rawtypes")
public class Product implements Comparable{
	public String pCode,pName;
	public float pPrice;
	public int pQty;
	public Product(String pCode, String pName, float pPrice, int pQty) {
		super();
		this.pCode = pCode;
		this.pName = pName;
		this.pPrice = pPrice;
		this.pQty = pQty;
	}
	
	public String toString()
	{
		return pCode+"\t"+pName+"\t"+pPrice+"\t"+pQty;
	}
	@Override
	public int compareTo(Object o) {
		Product p=(Product)o;
		if(pPrice==p.pPrice)
			return 0;
		else if(pPrice>p.pPrice)
			return 1;
		else return -1;
	}
	
	
	

	

}
