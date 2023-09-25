package session1;

public class Arrays1 {
	
	public static void main(String[] args) {
		int n = 5;
		int[] ar = { -1, -4, -6, -9, -9, -9 };
		int max = maxNum(ar, n);
		System.out.println(max);
	}

	
	
	private static int maxNum(int[] ar, int n) {

		int max = ar[0];
        
		for (int i = 0; i < n; i++) {
			if (max < ar[i]) {
				max = ar[i];
			}
		}
		return max;
	}
	
	
	
	
	

}
