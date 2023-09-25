package test;

public sealed class ClassA permits 
ClassB,ClassC,ClassD
{
	
	public void mA() {
		System.out.println("** ClassA mA() **");
		
	}

}
