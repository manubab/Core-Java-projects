import java.util.Scanner;
public class ArrayPrinting {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr=null;
		System.out.println("Enter array size");
        int lentgh=sc.nextInt();	
        arr=new int[arr.length];
        System.out.println("Enter array elements");
        for(int i=0;i<arr.length;i++) {
        	arr[i]=sc.nextInt();
        	
        }
        System.out.println("Display Array");
        for(int i=0;i<arr.length;i++) {
        	System.out.println(arr[i]+" ");
        	
        }
	}

}
