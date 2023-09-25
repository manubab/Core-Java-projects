package test;
public class Class_practice {
	
	public static void main(String[] args) {
		String s="java code";
		String r="uma maheshwari , raja manoharudu";
		System.out.println("charecter postion of the data 3 : "+s.charAt(3));
		System.out.println(s.charAt(6));
		String[] d=r.split(r);
		
		System.out.println(d);
		int count =0;
		for(int i=r.length()-1;i>=0;i--) {
			if((s.charAt(i)=='a')||(s.charAt(i)=='e')||(s.charAt(i)=='i')) {
				count++;
				
				
			}
			System.out.println("The number of Positions :"+count);
		}
		
		
	}
	

}
