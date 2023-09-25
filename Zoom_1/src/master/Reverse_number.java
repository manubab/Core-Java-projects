package master;

public class Reverse_number {
	static int rev=0;
	public static void rev(int n) {
		while(n>0) {
			int m=n%10;
			rev=(m*10)+n;
			n=n/10;
			System.out.println(m);
		}
	}
	public static void main(String[] args) {
		rev(123);
	}

}
