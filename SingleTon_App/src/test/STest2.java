package test;

public class STest2 {
	
	private static STest2 ob=null;
	
	private STest2() {
		
	}
	
	public static STest2 getRef() {
		
		if(ob==null) {
			ob=new STest2();
		}
		
		return ob;
		
	}
	

}
