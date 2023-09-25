package Practice;

public class DemoBlocks {
	private static int z;

	{
		int a = 12;
		System.out.println("** i am instance block **");

		a--;

		a--;
		System.out.println(" am a :" + a);
		
			
		
	}
	static {
		int z=12;
		System.out.println("i am z :"+ z);
		{
			System.out.println(" I am a inside block");
		}
		
	}
	{
		z++;
		z=120;
		System.out.println(" i feild :"+z);
	}

	public static void main(String[] args) {
		DemoBlocks dm = new DemoBlocks();
	}

}
