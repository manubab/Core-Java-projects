package test;
public class Test {
	public boolean getBranch(String br) {
		return switch (br) {
		case "CIVIL":
			yield true;
		case "EEE":
			yield true;
		case "MECH":
			yield true;
		case "ECE":
			yield true;
		case "CSE":
			yield true;
		default:
			yield false;
		};
	}

}
