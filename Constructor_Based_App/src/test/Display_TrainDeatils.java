package test;
//wap to read and display train details
//   Train No,Train Name,Departure time,arrived time,from station,to station,ticket price;

public class Display_TrainDeatils {
	public int TrainNo;
	public String TrainName,TrainDT,TrainDelay,TrainAT,FromStation,ToStation;
	int TicketPrice;
	
	public Display_TrainDeatils(int a,String b,String c,String d,String e,String f,String g,int h) {
		TrainNo=a;
		TrainName=b;
		TrainDT=c;
		TrainDelay=d;
		TrainAT=e;
		FromStation=f;
		ToStation=g;
		TicketPrice=h;
		
		
		System.out.println("TrainNo : "+TrainNo);
		System.out.println("TrainName : "+ TrainName);
		System.out.println("TrainDT : "+ TrainDT);
		System.out.println("TrainDelay :"+ TrainDelay);
		System.out.println("TrainAT : "+ TrainAT);
		System.out.println("FromStation :"+ FromStation);
		System.out.println("ToStation :"+ ToStation);
		System.out.println("TicketPrice :"+ TicketPrice);
		
	}
	public void getTrainDetails() {
		System.out.println("TrainNo : "+TrainNo);
		System.out.println("TrainName : "+ TrainName);
		System.out.println("TrainDT : "+ TrainDT);
		System.out.println("TrainDelay :"+ TrainDelay);
		System.out.println("TrainAT : "+ TrainAT);
		System.out.println("FromStation :"+ FromStation);
		System.out.println("ToStation :"+ ToStation);
		System.out.println("TicketPrice :"+ TicketPrice);
		
	}
	
	

}
