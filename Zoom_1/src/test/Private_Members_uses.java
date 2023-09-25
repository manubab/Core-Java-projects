package test;
import java.util.*;




class Demo1{
	int a;
	
	public void setaValue(int a) {
		this.a=a;
	}
	public int getaValue() {
		return a;
	}
}
class Demo{
	private int age;
	private String name;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

public class Private_Members_uses {
	public static void main(String[] args) {
		
		Demo d=new Demo();
		d.setAge(22);
		d.setName("manohar");
		Demo1 d1=new Demo1();
		d1.setaValue(123);
		System.out.println("a value :"+d1.getaValue());
		
		
		System.out.println("Student Name :"+d.getName());
		System.out.println("Student age :"+d.getAge());
	}
	
	
	
	

	
}
