package maccess;
import java.util.*;
import test.Translog;
public class DemoPoly2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try (sc;){
			try {
				System.out.println("Enter hAccNo :");
				long hAccNo=sc.nextLong();
				System.out.println("Enter bAccNo :");
				long bAccNo=sc.nextLong();
				System.out.println("inter amt :");
				float amt=sc.nextFloat();
				
				
				//immutable objects creation by using record ....!
				
				
				Translog ob=new Translog(Math.random(),hAccNo,bAccNo,amt,new Date());
				System.out.println("=== Log Details ====");
				System.out.println("Transection id :"+ob.tid());
				System.out.println("HAccNo :"+ob.hAccNo());
				System.out.println("BAccNo :"+ob.bAccNo());
				System.out.println("Amoubt :"+ob.amt());
				System.out.println("Date of Transection :"+ob.dTime());
				
			}
			catch(InputMismatchException ime) {
				System.out.println("invalid value...!");
			}
			
			catch(IllegalArgumentException iae) {
				System.out.println(iae.getMessage());
			}
				
			
		}
	
		

	}

}
