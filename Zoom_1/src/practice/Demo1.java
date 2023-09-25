package practice;

public class Demo1 {
		
	void m1() {
	int i,j, end=21,isprime=1,sum=0;
	for(i=2;i<=end;i++) {
		for(j=2;j<i/2;j++) {
			if(i%j==0) {
				isprime=0;
				break;
			}
		}
		if(isprime==1) {
			sum+=i;
		}
	}
	}
	
	public static void main(String[] args) {
		Demo1 dm=new Demo1();
		dm.m1();
	}

}
