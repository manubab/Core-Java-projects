package test;

public sealed class ClassD  extends ClassA permits ClassF
{
	public void mD() {
		System.out.println("** ClassD mD() **");
		
	}
	

}
