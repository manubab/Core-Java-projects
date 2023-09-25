package test;

public class PrimeOrNot {
	
	public void prime(int n) {
		int count=0;

		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println("its prime");
		}else {
			System.out.println("its not prime");
		}
		
		
		
		
	}

}
