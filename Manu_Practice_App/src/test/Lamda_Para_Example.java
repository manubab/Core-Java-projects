package test;
interface Addable{
	int  addtion(int a,int b);
}

public class Lamda_Para_Example {
	public static void main(String[] args) {
	Addable a1=( a, b) ->  a+b;
	 
	int result=a1.addtion(12,14);
			System.out.println(result);
		
		
	}

}
