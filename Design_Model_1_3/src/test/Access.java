package test;

public class Access {
	public static ITest deposit() {
		return new ITest() {

			public void process(int amt) {
				if(amt%100==0) {
					b.bal=b.bal+amt;
					System.out.println("Balence :"+b.getBal());
					System.out.println("Trasetion deposit completed successfully ...");
				}else {
					System.out.println("invalid amount");
				}
				
				
			}
				
			};
		
	}
	public static ITest withdraw() {
		return new ITest() {

			@Override
			public void process(int amt) {
				if(amt<b.bal) {
					if(amt%100==0) {
						b.bal=b.bal-amt;
						System.out.println("Balence :"+b.getBal());
						System.out.println("Transection withdraw completed succesfully...");
					}else {
						System.out.println("invalid amount..!");
						System.out.println("Transection faild.....!");
					}
				}
				
			}
			
		};
	}

}
