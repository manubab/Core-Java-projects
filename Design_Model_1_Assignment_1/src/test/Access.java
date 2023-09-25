package test;

public class Access {
	public static ITest gv() {
		return new ITest() {

			@Override
			public int compare(int a, int b) {
				if (a > b) {
					return a;
				} else {
					return b;
				}
			}

		};

	}
	public static ITest sv() {
		return new ITest() {

			@Override
			public int compare(int a, int b) {
				if(a<b) {
					return a;
					
				}else {
					return b;
				}
				
			}
			
		};
	}

}
