package test;

public class OddRound {
	
	public int oddRounder(int n) {
		
		if(n<0) {
			return -1;
		}else if(n==0) {
			return -2;
			
		}else {
			if(n%2==0) {
				return n;
			}else {
				int k=n/10;
				return(k+1)*10; 
			}
				
				
			}
			
		}
		
		
			
		
	}




