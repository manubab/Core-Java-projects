package com.test.sw;
public class SubClass {
	private class Sub1{
		public void m1(int a) {
			System.out.println("The value a :"+a);
		}
	}
	public void m1(int b) {
		System.out.println("The value a :"+b);
		Sub1 s1=new Sub1();
		s1.m1(b);
	}

}
