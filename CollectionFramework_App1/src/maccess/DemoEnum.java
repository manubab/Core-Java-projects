package maccess;
import test.Cars;
public class DemoEnum {
	public static void main(String[] args) {
		Cars c[]=Cars.values();
		
		for(Cars k:c)
		{
			System.out.println("Name of the Cars :"+k.toString()+"is Price is :"+k.price+"Thousend dollers");
		}
	}

}
