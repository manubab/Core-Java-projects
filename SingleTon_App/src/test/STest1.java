package test;

public class STest1 {
	
	private static STest1 ob=null;
	
	private STest1() {}
	
	static {
		ob=new STest1();
	}
	
	public static STest1 getRef() {
			
		return ob;
		
	}

}
