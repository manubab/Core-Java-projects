package com.manu.sw;
import java.util.*;
import com.test.sw.*;

public class DemoTranslog {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try(sc;) {
			try {
				System.out.println("Enter hAccNo : ");
				long hAccNo=sc.nextLong();
				System.out.println("Enter bAccNo : ");
				long bAccNo=sc.nextLong();
				System.out.println("Enter amt : ");
				float amt=sc.nextFloat();
				Translog ob=new Translog(Math.random(),hAccNo,bAccNo,amt,new Date());
				System.out.println("===== Log Details =====");
				System.out.println("Trasenction id :"+ob.getTid());
				System.out.println("hAccNo :"+ob.gethAcc());
				System.out.println("bHaccNo :"+ob.getbAcc());
				System.out.println("Amount :"+ob.getAmt());
				System.out.println("Date & Time :"+ob.getdTime()+"\n");
				
				System.out.println(ob.toString());
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			
		}

	}

}
