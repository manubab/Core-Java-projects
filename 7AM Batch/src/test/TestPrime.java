package test;

public class TestPrime {
	int count=0;
	public int prime(int n) {
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
		return n;
		
	}

}
