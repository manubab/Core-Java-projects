package test;

//  Book code,Book name,BookAuthuor,Book price,Book quantity;


public class Books {
	
	public String Bc,Bn,Ba;
	public int Pri,qua;
	
	public Books(String Bc,String Bn,String Ba,int Pri,int qua ) {
		this.Bc=Bc;
		this.Bn=Bn;
		this.Ba=Ba;
		this.Pri=Pri;
		this.qua=qua;
	}
	public String toString() {
		return Bc+"\t"+Bn+"\t"+Ba+"\t"+Pri+"\t"+qua;
	}

}
