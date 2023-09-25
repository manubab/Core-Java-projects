package test;

public class PalindromeNumber {
	public int palinNumber(int number) {
		int original=number;
		int reverse=0;
		while(number>0) {
			int digit=number%10;
			number=number/10;
			reverse=(reverse*10)+digit;
		}
		if(reverse==original) {
			System.out.println("its palin");
			
		}else {
			System.out.println("its not palin");
		}
		return reverse=original;
		
	}
}
	
			
	

			
















/**public static boolean isPalindrome(int number) {
int original = number;
int reverse = 0;
while (number > 0) {
    int digit = number%10;
    number = number/10;
    reverse = reverse*10+remain;
}
return reverse == original;
}**/