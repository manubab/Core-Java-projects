package test;
import java.util.*;
public class BookDetails {
	public String bCode,bName,bAuthor;
	public float bPrice;
	public int bQty;
	public BookDetails(String bCode, String bName, String bAuthor, float bPrice, int bQty) {
		super();
		this.bCode = bCode;
		this.bName = bName;
		this.bAuthor = bAuthor;
		this.bPrice = bPrice;
		this.bQty = bQty;
	}
	
	public String toString()
	{
		return bCode+"\t"+bName+"\t"+bAuthor+"\t"+bPrice+"\t"+bQty;
	}

}
