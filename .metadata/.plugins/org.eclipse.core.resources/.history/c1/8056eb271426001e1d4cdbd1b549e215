package practice;
import java.util.*;
import java.util.stream.*;
public class Class1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array :");
		int n1=sc.nextInt();
		
		Integer ar[]=new Integer[n1];
	     
		for(int i=0;i<n1;i++) {
			System.out.println(i+" value :");
			ar[i]=sc.nextInt();
		}
		System.out.println("Enter second Array Size :");
		int n2=sc.nextInt();
		
		Integer ar2[]=new Integer[n2];
	
		for(int j=0;j<n2;j++) {
			System.out.println("Enter :"+j+ " value");
			ar2[j]=sc.nextInt();
		}
		int sum=0;
		for(Integer a:ar) {
			sum=sum+a;
			
		}
		for(Integer b:ar2) {
			sum=sum+b;
		}
		
		Arrays.sort(ar);
		Arrays.sort(ar2);
		
		for(Integer c:ar) {
		System.out.print(c+"\n");
		}
		for(Integer d:ar2) {
			System.out.print(d);
		}
		System.out.println("BinarySerach :"+Arrays.binarySearch(ar, 30));
		
		Arrays.copyOf(ar, 12);
		
		for(Integer e :ar) {
			System.out.print(e);
		}
		
	
		
		
		

	

	}
}
