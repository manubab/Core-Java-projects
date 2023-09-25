package master;

public interface Master_Interface {
	public void Password(String s);
	
	public default boolean username(String s1) {
		System.out.println("I am first Default ....!");
		return false;
	}
	public default void intData( int a) {
		System.out.println("i am Integer data ");
		
	}

}

