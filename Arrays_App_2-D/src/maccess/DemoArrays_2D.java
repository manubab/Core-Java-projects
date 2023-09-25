package maccess;
import java.util.*;
public class DemoArrays_2D {

	@SuppressWarnings("removal")
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Integer[][] ob=new Integer[3][3];
		System.out.println("Enter the 3x3 Matrix :");
		int sum=0;
		for(int i=0;i<=2;i++) {
			for(int j=0;j<=2;j++) {
				ob[i][j]=new Integer(sc.nextLine());
			}//inner for close..
		}//outer for close...
		
		System.out.println("***************Displaying 3x3 Matrix ***********");
		for(Integer k[]:ob) {
			for(Integer z:k) {
				System.out.print(z.toString()+"");
			}//inner loop close..
			System.out.println();
		}//outer loop close...
		
		System.out.println("Displaying 3x3 Diagonal Elements :");
		for(int i=0;i<=2;i++) {
			for(int j=0;j<=2;j++) {
				if(i==j) {
					sum=sum+ob[i][j];
				}//condition  close..
			}//inner loop close...
		
			
		}//outer loop close.....
		
         System.out.println("Sum :"+sum);
	
	}

}
