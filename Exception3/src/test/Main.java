package test;

public class Main {
	public static void main(String[] args) {
		try {
			System.out.println("try block ....!");
			int n=10/0;
			try {
				System.out.println("                  inner try catch...!");
				int m=10/0;
			}catch(Exception e) {
				System.out.println("                  inner catch...!");
				int o=10/0;
				e.toString();
			}
			finally {
				System.out.println("                  inner finally...! ");
				int p=10/0;
			}
		}catch(Exception e) {
			
			System.out.println("catch block...!");
			e.printStackTrace();
			int n=10/0;
			e.toString();
		}
		finally {
			System.out.println("finally block...!");
			int q=10/0;
		}
	}

}
