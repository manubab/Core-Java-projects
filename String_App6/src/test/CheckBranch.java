package test;
public class CheckBranch {
	public boolean verifyBranch(String s) {
		return switch (s) {
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
