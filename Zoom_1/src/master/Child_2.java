package master;

public class Child_2 implements Master_Interface{

	@Override
	public void Password(String s) {
		System.out.println("i am chile2 Pasword");
		
	}
	public static void main(String[] args) {
		Master_Interface i=new Child_2();
		i.intData(12);
		i.Password("raju");
		i.username("manu");
	}

}
