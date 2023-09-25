package lambda_own;

interface Manu{
	
	public void draw();
}

public class Demo1 {
	
	public static void main(String[] args) {
		
	
	int width=20;
	Manu ob=new Manu()
			{
		public void draw()
		{
			System.out.println("Drawing :"+width);
		}
			};
			
			ob.draw();
	}

}
