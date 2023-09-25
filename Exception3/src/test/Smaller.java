package test;

public class Smaller extends Exception implements ICompare{
	public Smaller(String msg) {
		super(msg);
		
	}
	public int comapareTo(int a,int b)throws Smaller {
		try {
			if(a<0||b<0) {
				Smaller ob=new Smaller("Enter only +ve value.... -1");
				throw ob;
			}
			if(a==0||b==0) {
				Smaller ob=new Smaller("value zero take Integer.... 0");
				throw ob;
			}
			if(a<b) {
				return a;
				
			}else {
				return b;
			}
			
		}catch(Smaller ob) {
			throw ob;
			
		}
		
		
	}
	

}
