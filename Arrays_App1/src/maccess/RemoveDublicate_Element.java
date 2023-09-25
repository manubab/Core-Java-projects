package maccess;
import java.util.*;

public class RemoveDublicate_Element {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of the array : ");
		int n=sc.nextInt();
		int a[]=new int[n];
		
		for(int i=0;i<a.length;i++) 
		{
			System.out.println(i+"Element value :");
			a[i]=sc.nextInt();

		}
		for(int b:a) {
			System.out.print(b+" ");
		}
		
		for(int i=0;i<a.length;i++) {
			for(int j=1;j<=i;j++)
			{
				if(a[i]==a[j])
				{
					a[i]=a[i+1];
				}
				
			}
			System.out.println(a);
		}
		
		
		
	}

}
