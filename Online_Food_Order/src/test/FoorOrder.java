package test;
import java.util.Scanner;
public class FoorOrder {
	public int freshFries=50;
	public int barger=80;
	public int coldCoffie=65;
	public int pastrie=70;
	public int pizza=120;
	public int icedTea=45;
	public int colDrink=30;
	public int total;
	public int Quntity;
	public String again;
	
	public void displayMenu()
	{
		System.out.println("============Welcome===========");
		System.out.println("freshFries                     50/-");
		System.out.println("barger                         80/-");
		System.out.println("coldCoffie                     65/-");
		System.out.println("pastrie                        70/-");
		System.out.println("pizza                          50/-");
		System.out.println("iceTea                         45/-");
		System.out.println("colddrink                      30/-");
		System.out.println("Exit                                ");
		
 
	}
	

	public void order() {
		Scanner sc=new Scanner(System.in);
		while(true)
		{
		System.out.println("=============== Order plese ==============");
		 System.out.println("Enter choice :");
			int choice=sc.nextInt();

        
		 switch(choice)
		 {
		 case 1:
			 System.out.println("you have selected frenchfries ");
			 System.out.println();
			 System.out.println("Pls enter Desired Quntity :");
			 Quntity=sc.nextInt();
			 
			 total=total+Quntity*freshFries;
			 
			 break;
		 case 2:
			 System.out.println("you have selected berger ");
			 System.out.println();
			 System.out.println("Pls enter Desired Quntity :");
			 Quntity=sc.nextInt();
			 
			 total=total+Quntity*barger;
			 
			 break;
		 case 3:
			 System.out.println("you have selected coldCoffie ");
			 System.out.println();
			 System.out.println("Pls enter Desired Quntity :");
			 Quntity=sc.nextInt();
			 
			 total=total+Quntity*coldCoffie;
			 
			 break;
			 
		 case 4:
			 System.out.println("you have selected pastrie ");
			 System.out.println();
			 System.out.println("Pls enter Desired Quntity :");
			 Quntity=sc.nextInt();
			 
			 total=total+Quntity*pastrie;
			 
			 break;
		 case 5:
			 System.out.println("you have selected pizza ");
			 System.out.println();
			 System.out.println("Pls enter Desired Quntity :");
			 Quntity=sc.nextInt();
			 
			 total=total+Quntity*pizza;
			 
			 break;
		 case 6:
			 System.out.println("you have selected icedTea ");
			 System.out.println();
			 System.out.println("Pls enter Desired Quntity :");
			 Quntity=sc.nextInt();
			 
			 total=total+Quntity*icedTea;
			 
			 break;
		 case 7:
			 System.out.println("you have selected coldDrink ");
			 System.out.println();
			 System.out.println("Pls enter Desired Quntity :");
			 Quntity=sc.nextInt();
			 
			 total=total+Quntity*colDrink;
			 
			 break;
			 
		 case 8:
			 System.out.println("Stop Operation.....!");
			 System.exit(0);
			 
			 default:
				 System.out.println("invalid choice");
			 
		 }
		 
		 System.out.println();
		 System.out.print("Do u wish to order antthing else (Y/N)");
		 again=sc.next();
		 if(again.equalsIgnoreCase("Y"))
		 {
			 order();
			 
		 }else if(again.equalsIgnoreCase("N")){
			 bill();
			 System.exit(0);
			 
		 }
		 else {
			System.out.println("invalid choice..");
		 }
		 
		 
	}
	}
	public void bill()
	{
		System.out.println("========Thanks for ordering =========");
		System.out.println("*********** Your bill :"+total+" **************");
		
	}
	

}
