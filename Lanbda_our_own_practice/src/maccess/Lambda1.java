package maccess;
import test.Drawable;
public class Lambda1 {
	public static int width=10;
	public static void main(String[] args) {
		
		
//		Drawable d=new Drawable() {
//
//			public void draw() {
//				System.out.println("Drawing :"+width);
//				
//			}
//			
//		};
//	d.draw();
		
		Drawable d2=()->System.out.println("Drawing :"+width);
		d2.draw();
			
		
	}
	

}
