package Oops;

import java.io.IOException;

/*abstract class bike{
	 
	abstract public void run(int i);
	
}
public class Honda extends bike{
	public void run(int i) {
		int t=1;
		int d=20;
		double s=d/t;
		System.out.println(" bike traveled distance"+   s  );
	}
	public static void main(String[] args) {
		Honda H= new Honda();
		H.run(0);
		System.out.println(H);
		
	}
	
}

abstract class  A{
	abstract public void add(int a, int b);
	
	
}
public class B extends A{

	
	public void  add(int a, int b) {
		  
		int c= a+b;
			
		System.out.println(c);
		
	}
	public static void main(String[] args) {
		B b = new B();
		b.add(1000, 326464);
	}
	
}

abstract class A{
	abstract void firstmethod();
	void secondmethod() {
		System.out.println("second");
	}
	
}
abstract class B extends A{

	
	void firstmethod() {
		System.out.println("first");
		thirdmethod();
	}
	abstract void thirdmethod();
	
}
public class C extends B{
	void thirdmethod() {
		System.out.println("third");
		
	}
	
}



abstract  class A{
	{
		
	}
public static void main(String[] args) {
	{
		System.out.println("instance block");
	}
	
}
}

public class ABC{
	public ABC() {
	System.out.println("class leval first constucter");
	}
	ABC(int i){
		i=12;
		
	}
	
	public static void main(String[] args) {
		ABC abc=new ABC();
		System.out.println();
	}
		
	
}



abstract class A{
	abstract void run();
	
}
class B extends A{
	void run() {
		System.out.println("running");
		
	}	
}
public class C extends A{
	void run() {
		System.out.println("slow run");
	}
	public static void main(String[] args) {
		A a=new C();
		a.run();
		A a1=new B();
		a1.run();
	}
	
}

public class account{
	int a; 
	double b;
	int total;
	void add(int a,double b){
		this.a=a;
		this.b=b;
	double	total=a+b;
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		account ac=new account();
		ac.add(12, 12.02);
		}
	
}








class one{
	static int a=0;
	void one() {
		System.out.println("i am one ");
	}
}
class Two extends one{
	
	void one(int a) {
		super.a=12;
		super.one();
		System.out.println("i am two");
	}
}
		
public class Sana{
      public static void main(String[] args) {
		Two obj=new Two();
		obj.one(12);
		
		
		
	}
}

class Number{
	private int a;

	public int get() {
		return a;
	}

	public void set(int a) {
		this.a = a;
	}
	
}
public class EncapTest{
	public static void main(String[] args) {
		Number n=new Number();
		n.set(10);
		int num=n.get();
		System.out.println(num);
	}
}
public class Abs{
	public static void main(String[] args)throws IOException {
		System.out.println("Enter the number");
		byte[] a=new byte[10];
		System.in.read(a);		
		String s=new String(a);
		System.out.println(s);
		
	}
}*/

class Ab{
	private String sname;
	private int sid;
	private static String SclName;
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}	
}
public class Stu{
	public static void main(String[] args) {
		
	
	Ab a=new Ab();
	a.setSname("baby");
	a.setSid(11);
	
	System.out.println("Student name: "+ a.getSname());
	System.out.println("Studnet sid: "+ a.getSid());
	}
	
}































	

	






