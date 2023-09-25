package test;

public class Factorial {
	int sum=1;
	public int fact(int n) {
		for(int i=n;i>=1;i--) {
			sum=sum*i;
			
		}
		return sum;
					
					
	}

}



//4!=4x3x2x1=24