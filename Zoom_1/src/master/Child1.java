package master;

public class Child1 implements Master_Interface {
	@Override
	public void Password(String s) {
		
		System.out.println("First child1 Class");
	}
	public static void main(String[] args) {
		Master_Interface i= new Child1();
		
		i.intData(12);

		i.username("manu");
	}

	

}
