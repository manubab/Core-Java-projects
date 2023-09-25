package test;
public class Test {
	public boolean vest(String b) {
		return switch(b) {
		case "CIVIL": yield true;
		case "EEE"  : yield true;
		case "MECH" : yield true;
		case "ECE"  : yield true;
		case "CSE"  : yield true;
		default :yield false;
		};
		
		
		
	}
}

