package test;
public class DisplayTrainDetails {
	public int TrainNo;
	public String TrainName,TrainDT,TrainDelay,TrainAT,FromStation,ToStation;
	int TicketPrice;
	
	public DisplayTrainDetails(int TrainNo,String TrainName,String TrainDT,String TrainDelay,String TrainAT,String FromStation,String ToStation,int TicketPrice) {
		TrainNo=this.TrainNo;
		TrainName=this.TrainName;
		TrainDT=this.TrainDT;
		TrainDelay=this.TrainDelay;
		TrainAT=this.TrainAT;
		FromStation=this.FromStation;
		ToStation=this.ToStation;
		TicketPrice=this.TicketPrice;
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
