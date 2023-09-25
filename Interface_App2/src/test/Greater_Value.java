package test;

public class Greater_Value implements ITest {
	public int cal(int a,int b) {
		System.out.println("The value :"+ITest.a);
		if(a>b) { 
			return a;
		}
		else {
			return b;
		}
		
	}
	

}
