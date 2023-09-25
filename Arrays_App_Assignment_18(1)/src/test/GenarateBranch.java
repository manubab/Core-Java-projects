package test;

public class GenarateBranch {
	public String genarateBranch(String brcode) {
		return switch (brcode) {
		case "01":
			yield "CIVIl";
		case "02":
			yield "EEE";
		case "03":
			yield "Mech";
		case "04":
			yield "ECE";
		case "05":
			yield "CSE";
		default:
			yield null;

		};

	}

}
