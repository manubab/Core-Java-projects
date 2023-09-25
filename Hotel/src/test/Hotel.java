package test;

import java.util.Scanner;

public class Hotel extends Exception {
	// Morning Items 
	public int idli=45;
	public int puri=50;
	public int dosa=40;
	public int voda=30;
	public int pongal=40;
	public int ch;
	public int qty;
	public int total;
	public String again;
	
	
	
	public void tiffins()
	{
		System.out.println("================Welcome to Cafee===========");
		System.out.println(" 1.idli                    45/-");
		System.out.println(" 2.puri                    50/-");
		System.out.println(" 3.dosa                    40/-");
		System.out.println(" 4.voda                    30/-");
		System.out.println(" 5.pongal                  40/-");
		System.out.println(" 6.Exit                        ");

	}
        

	public void order() throws Hotel
	{
		Scanner sc=new Scanner(System.in);
		while(true) {
		System.out.println("==== Order pls ====");
		ch =sc.nextInt();
		
		switch(ch)
		{
		
		case 1:
			System.out.println("Your r selected idli :");
			System.out.println("Pls Enter desired Quntity :");
			qty=sc.nextInt();
			total=qty*idli;
			
			break;
		case 2:
			System.out.println("Your r selected puri :");
			System.out.println("Pls Enter desired Quntity :");
			qty=sc.nextInt();
			total=total+qty*puri;
			break;
		case 3:
			System.out.println("Your r selected dosa :");
			System.out.println("Pls Enter desired Quntity :");
			qty=sc.nextInt();
			total=total+qty*dosa;
			break;
		case 4:
			System.out.println("Your r selected voda :");
			System.out.println("Pls Enter desired Quntity :");
			qty=sc.nextInt();
			total=total+qty*voda;
			break;
		case 5:
			System.out.println("Your r selected pongal :");
			System.out.println("Pls Enter desired Quntity :");
			qty=sc.nextInt();
			total=total+qty*pongal;
			break;
			
			
		case 6:
			System.out.println("Operation stopped ");
			System.exit(0);
			default:
				System.out.println("invalid choice...!");
			
		}
		
		System.out.println("if u wont Any other things (Y/N)");
		again=sc.next();
		if(again.equalsIgnoreCase("Y"))
		{
			order();
		}else if(again.equalsIgnoreCase("N")){
			billGenarate();
			System.exit(0);
			
		}else {
			System.out.println("pls Enter Valid one...!");
		}
		
	}
	}
	 public void billGenarate() {
			
			System.out.println("==== Tqs for Comming ====");
			System.out.println("Total your bill :"+total  );
			}
	
	public static void main(String[] args)  {
		Hotel h=new Hotel();
		h.tiffins();
		try {
			h.order();
		} catch (Hotel e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	

}
