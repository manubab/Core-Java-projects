package maccess;
import test.*;
public class Demo_inner_Abstact_Class  {
	public static void main(String[] args) {
    HelloEveryone.Abcs1 ob1=new HelloEveryone.Abcs1() {
		
		@Override
		public void abcs1(int a) {
			System.out.println("*** abstract ***");
			System.out.println("The value :"+a);
		}
    };
		
    ob1.abcs1(121);
    ob1.m1(212);
    
    HelloEveryone.Alt ob2 = new HelloEveryone.Alt() {
		
		@Override
		public void m1(int a) {
			// TODO Auto-generated method stub
			
		}
	}; 
    
    
    
   
    
    
    
		
	
		
	}
}

			
		
		



