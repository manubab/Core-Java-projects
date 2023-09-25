package test;

public class Print_prime_number_Some_Range {
	public static void prime() {
		for(int i=1;i<=100;i++) {
			int count=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==2)
			System.out.print(i+" ");

		}	
	}
	public static void main(String[] args) {

		Print_prime_number_Some_Range.prime();
		
	}

}
