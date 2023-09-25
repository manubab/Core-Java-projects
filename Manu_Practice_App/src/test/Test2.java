package test;
@FunctionalInterface

interface Square{
	public abstract int area(int a);
}
public class Test2 {
	static void area(Square obj) {
		System.out.println("HashCode :"+obj.hashCode());
		System.out.println("area :"+obj.area(11));
	}
	public static void main(String[] args) {
		Square s=(int value)->{
			return value*value;
			
		};
		System.out.println(s.area(12));
	Test2.area(s);
	area((int value)->{
			return value*value;
			
		});
	
	}

}
