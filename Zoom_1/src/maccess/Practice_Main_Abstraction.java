package maccess;

interface VehiclePlan {
	void noOfEngine();
	void noOfVeels();
}
abstract class Vehicle {
	void noOfEngine() {
		System.out.println("I have on Engine :");
	}
}
class Bike extends Vehicle {
	void noOfVeels() {
		System.out.println(" I am Bike i have only 2 weels");
	}

}
public class Practice_Main_Abstraction {
	public static void main(String[] args) {
		Bike b = new Bike();
		b.noOfEngine();
		b.noOfVeels();

	}

}
