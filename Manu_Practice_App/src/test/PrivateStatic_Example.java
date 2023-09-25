package test;

interface I{
	void m();
}
public class PrivateStatic_Example implements I {
	
	
	
	public void m() {
		for(int i=0;i<=12;i++) {
			System.out.println("Value :"+i);
		}
		
	}
	public static void main(String[] args) {
		I i=new PrivateStatic_Example();
		i.m();
		
		I ma=()->System.out.println("Private method Lamda ...!");
		ma.m();

	}

	
}
