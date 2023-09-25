package test;

interface Cng_Car {
	void drive();
	void cng_kit();
	

}
interface Petrol_Car {
	void drive();
	void petrol_kit();

}

public class Hybrid_Car implements Cng_Car,Petrol_Car {
	
	@Override
	public void drive() {
		System.out.println("*****Hybrid_Car Driving****");
		
	}

	@Override
	public void petrol_kit() {
		System.out.println("Using Petrol-kit for-Hybrid_Car");
		
	}

	

	@Override
	public void cng_kit() {
		System.out.println("Using Cng_Kit for-Hybrid_Car");
		
	}

	

}
