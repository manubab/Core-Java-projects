package test;

public class ReverseNumber {
	
	public int rev=0;
	public int rev(int n) {
		while(n>0) {
			int k=n%10;
			n=n/10;
			rev=(rev*10)+k;
		}
		return rev;		
	}
}
	
	
	


