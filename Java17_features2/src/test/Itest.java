package test;

public sealed interface Itest permits ClassA,ClassB, ClassC
{
	public void m();

}
