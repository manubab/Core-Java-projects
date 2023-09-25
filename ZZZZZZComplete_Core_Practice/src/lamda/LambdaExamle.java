package lamda;


@FunctionalInterface

interface Operator
{
	void process(String a);
	
}


public class LambdaExamle 
{
	
	public static void main(String[] args) {
		
//		Operator<String> o1=(a)->a.substring(0, 2);
//		
//		System.out.println(o1.process("java "));
//		
		
//          	new Thread(
//				
//				()->System.out.println("Madhu sudhan thalari")
//				
//				).start();
//          	
		
          	new Operator() {
				
				@Override
				public void process(String s) {
					
					System.out.println(s.substring(4, 8));
				}
			}.process("Thalari Madhu sundhan Full stack java Developer");
		
	}
	
}
