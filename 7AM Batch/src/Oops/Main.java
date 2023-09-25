package Oops;

 /*class Player {
	private String pname;
	private int pAge;
	private String gamename;
	
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public void setpAge(int pAge) {
		this.pAge = pAge;
	}
	public void setGamename(String gamename) {
		this.gamename = gamename;
	}
	
	public Player(String pname,int pAge,String gamename) {
		this.pname=pname;
		this.pAge=pAge;
		this.gamename=gamename;
	}
	public String getpname() {
		
		return pname;
		
	}
	public int getpAge() {
		return pAge;
		
	}
     public String gamename() {
	    return gamename;
     }
}

public class PlayerTests{
	public static void main(String[] args) {
		Player p=new Player("manu",19,"foodball");
		Player  p1 = new Player("rajesh",20,"cricket");
		
		String Playname = p.getpname();
		int pAge=p.getpAge();
		String Pgamename=p.gamename();
		
		String Playname1 = p.getpname();
		int pAge1=p.getpAge();
		String Pgamename1=p.gamename();
		
		
		
		System.out.println("player name"+ Playname);
		System.out.println("Player PAge"+  pAge);
		System.out.println("Player Gamename"+ Pgamename);
		
		System.out.println("player name"+ Playname1);
		System.out.println("Player PAge"+  pAge1);
		System.out.println("Player Gamename"+ Pgamename1);
		
		
		
	}
	
}*/


 class employe{
	private String ename;
	private int Eid;
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	
	
	public void setEid(String eid) {
		this.Eid = Eid;
	}
	employe(String ename,int Eid){
		this.ename=ename;
		this.Eid=Eid;
		
	}
	
	public String getename() {
		return ename;
		
	}
	public int getEid() {
		return Eid;
	}
	
	
}
public class Main{
	public static void main(String[] args) {
		employe e=new employe("manu",1);
		
		String s=e.getename();
		int n=e.getEid();
		System.out.println("employee name:" +s);
		System.out.println("employee id:"+n);
		
		
	}
	
}



