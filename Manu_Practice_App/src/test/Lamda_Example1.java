package test;

interface Shape{
	void draw();
}

public class Lamda_Example1 {
	public static void main(String[] args) {
		
		
//		Shape Rectangle=()-> System.out.println("Rectangle class : draw() method ");
//		Shape Square=()->System.out.println("Square class : draw() method ");
//		Shape Circle=()->System.out.println("Circle class :draw method");
		
	
		
//		Rectangle.draw();
//		Square.draw();
//		Circle.draw();
		
		print(()-> System.out.println("Rectagle class : draw() method "));
		print(()->System.out.println("Square class : draw() method "));
		print(()->System.out.println("Circle class :draw method"));


	
	}

	private static void print(Shape shape) {
		shape.draw();
		
	}

}
