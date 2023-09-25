package test;

public interface Itest {
	public abstract void m1(int a);
	
	public static void m2(int a) {
		System.out.println("====m2(a)=====");
		System.out.println("The value :"+a);
	}
	public default void m3(int a) {
		System.out.println("===Interface default m3(a) ====");
		System.out.println("The val :"+a);
	}
	

}
