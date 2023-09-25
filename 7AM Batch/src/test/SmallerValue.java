package test;

public class SmallerValue {
	public int smaller(int a,int b,int c) {
		if(a<b&&b<c) {
			return a;
			
		}else if(b<c&&c<a) {
		  return b;
		  
		}else {
			return c;
		}
		
	}

}
