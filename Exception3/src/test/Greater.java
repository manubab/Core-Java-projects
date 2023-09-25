package test;

public class Greater extends Exception implements ICompare{
	
	public Greater(String msg) {
		super(msg);
	}
	public int comapareTo(int a, int b) throws Greater  {
		
		try {
			if(a<0||b<0) {
				Greater ob=new Greater("Enter only +ve value.... -1");
				throw ob;
			}
			if(a==0||b==0) {
				Greater ob=new Greater("value zero take Integer.... 0");
				throw ob;
			}
			if(a>b) {
				return a;
				
			}else {
				return b;
			}
			
		}catch(Greater ob) {
			throw ob;
			
		}
		
		
	}

}
