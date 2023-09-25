package Practice;
import java.util.stream.*;
import java.util.*;

class Point
{
	Integer x,y;
	Point(Integer x,Integer y)
	{
		this.x=x;
		this.y=y;
	}
	
	public String toString()
	{
		return this.x+","+this.y;
	}
}

public class Sorted {

	public static void main(String[] args) 
	{
		List<Point> ob=new ArrayList<Point>();
		
		ob.add(new Point(10,20));
		ob.add(new Point(5,10));
		ob.add(new Point(1,10));
		ob.add(new Point(50,2000));
		
		ob.stream().sorted((p1,p2)->p1.x.compareTo(p2.x)).forEach(System.out::println);
		

	}

}
