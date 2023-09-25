package test;
public interface Itest {
	public abstract void m1(int a);
	
	public default void m2(int b) {
		System.out.println("**** interface deafult m2(b) ******");
		System.out.println("The  value b :"+b);
	}
		
	

}
