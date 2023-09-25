package MyProject;
import java.util.Arrays;
public class TEST {
	int i=10;
	{
		m1();
		System.out.println("first onstance block");
	}
	TEST(){
		System.out.println("constructer");
		
	}
	public static void main(String[] args) {
		int[] a= {12,13,14,15};
		Arrays.sort(a);
		System.out.println(Arrays.binarySearch(a, 12));
		System.out.println();
		TEST t=new TEST();
		System.out.println("main");
		
	}
	public void m1() {
		System.out.println(j);
	}
	{
		System.out.println("second instance block");
	}
	int j=20;
	
	
	
	
	
	
	
	
	
	

}
