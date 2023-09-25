package Practice;
public class Question1 {
	private static int a;
	private  int b;
	static {
		a=1;
		//b=2;
	}
	public static void main(String[] args) {
		
	
		Question1 q1=new Question1();
		Question1 q2 = new Question1();
		
		q2.b=1;
		System.out.println(q1.a+q2.b);
		
	}
}
		
		
				
	


