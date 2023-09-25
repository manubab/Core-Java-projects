package test;
public class Book implements Comparable {
	public String bname,bauthor;
	public float bprice,bqty;
	public Book(String bname, String bauthor, float bprice, float bqty) {
		super();
		this.bname = bname;
		this.bauthor = bauthor;
		this.bprice = bprice;
		this.bqty = bqty;
	}
	public String toString() {
		return bname+"\t"+bauthor+"\t"+bprice+"\t"+bqty;
		
	}
	public int compareTo(Object o) {
		  
		      Book b=(Book)o;
		    int k=  bname.substring(1, 2).compareTo(b.bname.substring(1, 2));
		    
		    if(k==0)
		    {
		    	return 0;
		    }else if(k>0)
		    {
		    	return 1;
		    }else {
		    	return -1;
		    }
		  
	}
	

}
