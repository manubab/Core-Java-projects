package test;

public class CheckPin {
	public boolean checkpin(int pin) {
		return switch(pin) {
		case 1111:yield true;
		case 2222:yield true;
		case 3333:yield true;
		default:
			yield false;
		};
	}
}
