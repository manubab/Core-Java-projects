package test;
public class String_Methods_Usage_Class {
	
	public static void main(String[] args) {
		
		
		
		
		
		String s="i am a code 3 right";
		String S=" i am export on java";
		System.out.println(s.charAt(2));
		System.out.println(s.equals(S));
		System.out.println(s.indent(5));
		System.out.println(s.indexOf('3'));
		System.out.println(s.codePointAt(3));
		System.out.println(s.codePointBefore(2));
		
		System.out.println(s.codePointAt(3));
		System.out.println(s.codePointCount(12, 18));
		System.out.println(s.compareTo(S));
		System.out.println(s.compareToIgnoreCase(S));
		
		System.out.println(s.concat(S));
		System.out.println(s.contains(S));
		System.out.println(s.contains(S));
		System.out.println(s.contentEquals(S));
		System.out.println(s.endsWith(S));
		System.out.println(s.equals(S));
		System.out.println(s.hashCode());
		System.out.println(s.indent(5));
		
		
		System.out.println(s.indexOf(5));
		
		System.out.println(s.repeat(5));
		
		System.out.println(s.valueOf('j'));
	}

}
