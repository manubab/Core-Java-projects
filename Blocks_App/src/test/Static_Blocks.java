package test;
public class Static_Blocks {
	static {
		int a=12;
		System.out.println(" am a"+ a);
		
	}
	public static void main(String[] args) {
		Static_Blocks b=new Static_Blocks();
		
	}
	public static  int a;
	{
		a=12;
		a++;
		a++;
	System.out.println(a);
	}

}
