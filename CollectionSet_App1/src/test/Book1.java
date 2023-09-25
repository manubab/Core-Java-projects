package test;

public class Book1 implements Comparable {
	
		public String bname,bauthor;
		public Float bprice,bqty;
		public Book1(String bname, String bauthor, Float bprice, Float bqty) {
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
			  
			      Book1 b=(Book1)o;
			 int k= bprice.compareTo(b.bprice);
			    
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




