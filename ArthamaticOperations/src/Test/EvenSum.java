package Test;

public class EvenSum {
	public int sum=0;
	public int cal(int n) {
		for(int i=1;i<=n;i++) {
		if(i%2==0) {
			sum=sum+i;
		}
		
		}
		return sum;
	}
}
		
	


