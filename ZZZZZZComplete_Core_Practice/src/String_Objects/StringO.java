package String_Objects;
import java.util.Scanner;
//C:\Users\T.manohar>javap java.lang.String
//Compiled from "String.java"
//public final class java.lang.String implements java.io.Serializable, java.lang.Comparable<java.lang.String>, java.lang.CharSequence, java.lang.constant.Constable, java.lang.constant.ConstantDesc {
//  static final boolean COMPACT_STRINGS;
//  public static final java.util.Comparator<java.lang.String> CASE_INSENSITIVE_ORDER;
//  static final byte LATIN1;
//  static final byte UTF16;
//  public java.lang.String();
//  public java.lang.String(java.lang.String);
//  public java.lang.String(char[]);
//  public java.lang.String(char[], int, int);
//  public java.lang.String(int[], int, int);
//  public java.lang.String(byte[], int, int, int);
//  public java.lang.String(byte[], int);
//  public java.lang.String(byte[], int, int, java.lang.String) throws java.io.UnsupportedEncodingException;
//  public java.lang.String(byte[], int, int, java.nio.charset.Charset);
//  static java.lang.String newStringUTF8NoRepl(byte[], int, int);
//  static java.lang.String newStringNoRepl(byte[], java.nio.charset.Charset) throws java.nio.charset.CharacterCodingException;
//  static byte[] getBytesUTF8NoRepl(java.lang.String);
//  static byte[] getBytesNoRepl(java.lang.String, java.nio.charset.Charset) throws java.nio.charset.CharacterCodingException;
//  static int decodeASCII(byte[], int, char[], int, int);
//  public java.lang.String(byte[], java.lang.String) throws java.io.UnsupportedEncodingException;
//  public java.lang.String(byte[], java.nio.charset.Charset);
//  public java.lang.String(byte[], int, int);
//  public java.lang.String(byte[]);
//  public java.lang.String(java.lang.StringBuffer);
//  public java.lang.String(java.lang.StringBuilder);
//  public int length();
//  public boolean isEmpty();
//  public char charAt(int);
//  public int codePointAt(int);
//  public int codePointBefore(int);
//  public int codePointCount(int, int);
//  public int offsetByCodePoints(int, int);
//  public void getChars(int, int, char[], int);
//  public void getBytes(int, int, byte[], int);
//  public byte[] getBytes(java.lang.String) throws java.io.UnsupportedEncodingException;
//  public byte[] getBytes(java.nio.charset.Charset);
//  public byte[] getBytes();
//  public boolean equals(java.lang.Object);
//  public boolean contentEquals(java.lang.StringBuffer);
//  public boolean contentEquals(java.lang.CharSequence);
//  public boolean equalsIgnoreCase(java.lang.String);
//  public int compareTo(java.lang.String);
//  public int compareToIgnoreCase(java.lang.String);
//  public boolean regionMatches(int, java.lang.String, int, int);
//  public boolean regionMatches(boolean, int, java.lang.String, int, int);
//  public boolean startsWith(java.lang.String, int);
//  public boolean startsWith(java.lang.String);
//  public boolean endsWith(java.lang.String);
//  public int hashCode();
//  public int indexOf(int);
//  public int indexOf(int, int);
//  public int lastIndexOf(int);
//  public int lastIndexOf(int, int);
//  public int indexOf(java.lang.String);
//  public int indexOf(java.lang.String, int);
//  static int indexOf(byte[], byte, int, java.lang.String, int);
//  public int lastIndexOf(java.lang.String);
//  public int lastIndexOf(java.lang.String, int);
//  static int lastIndexOf(byte[], byte, int, java.lang.String, int);
//  public java.lang.String substring(int);
//  public java.lang.String substring(int, int);
//  public java.lang.CharSequence subSequence(int, int);
//  public java.lang.String concat(java.lang.String);
//  public java.lang.String replace(char, char);
//  public boolean matches(java.lang.String);
//  public boolean contains(java.lang.CharSequence);
//  public java.lang.String replaceFirst(java.lang.String, java.lang.String);
//  public java.lang.String replaceAll(java.lang.String, java.lang.String);
//  public java.lang.String replace(java.lang.CharSequence, java.lang.CharSequence);
//  public java.lang.String[] split(java.lang.String, int);
//  public java.lang.String[] split(java.lang.String);
//  public static java.lang.String join(java.lang.CharSequence, java.lang.CharSequence...);
//  static java.lang.String join(java.lang.String, java.lang.String, java.lang.String, java.lang.String[], int);
//  public static java.lang.String join(java.lang.CharSequence, java.lang.Iterable<? extends java.lang.CharSequence>);
//  public java.lang.String toLowerCase(java.util.Locale);
//  public java.lang.String toLowerCase();
//  public java.lang.String toUpperCase(java.util.Locale);
//  public java.lang.String toUpperCase();
//  public java.lang.String trim();
//  public java.lang.String strip();
//  public java.lang.String stripLeading();
//  public java.lang.String stripTrailing();
//  public boolean isBlank();
//  public java.util.stream.Stream<java.lang.String> lines();
//  public java.lang.String indent(int);
//  public java.lang.String stripIndent();
//  public java.lang.String translateEscapes();
//  public <R> R transform(java.util.function.Function<? super java.lang.String, ? extends R>);
//  public java.lang.String toString();
//  public java.util.stream.IntStream chars();
//  public java.util.stream.IntStream codePoints();
//  public char[] toCharArray();
//  public static java.lang.String format(java.lang.String, java.lang.Object...);
//  public static java.lang.String format(java.util.Locale, java.lang.String, java.lang.Object...);
//  public java.lang.String formatted(java.lang.Object...);
//  public static java.lang.String valueOf(java.lang.Object);
//  public static java.lang.String valueOf(char[]);
//  public static java.lang.String valueOf(char[], int, int);
//  public static java.lang.String copyValueOf(char[], int, int);
//  public static java.lang.String copyValueOf(char[]);
//  public static java.lang.String valueOf(boolean);
//  public static java.lang.String valueOf(char);
//  public static java.lang.String valueOf(int);
//  public static java.lang.String valueOf(long);
//  public static java.lang.String valueOf(float);
//  public static java.lang.String valueOf(double);
//  public native java.lang.String intern();
//  public java.lang.String repeat(int);
//  void getBytes(byte[], int, byte);
//  void getBytes(byte[], int, int, byte, int);
//  java.lang.String(char[], int, int, java.lang.Void);
//  java.lang.String(java.lang.AbstractStringBuilder, java.lang.Void);
//  java.lang.String(byte[], byte);
//  byte coder();
//  byte[] value();
//  boolean isLatin1();
//  static void checkIndex(int, int);
//  static void checkOffset(int, int);
//  static void checkBoundsOffCount(int, int, int);
//  static void checkBoundsBeginEnd(int, int, int);
//  static java.lang.String valueOfCodePoint(int);
//  public java.util.Optional<java.lang.String> describeConstable();
//  public java.lang.String resolveConstantDesc(java.lang.invoke.MethodHandles$Lookup);
//  public int compareTo(java.lang.Object);
//  public java.lang.Object resolveConstantDesc(java.lang.invoke.MethodHandles$Lookup) throws java.lang.ReflectiveOperationException;
//  static {};
//}


public class StringO {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	
		
		String s1="manu is a java devoloper ";
		
		String s2=new String("manu");
		
		if(s1.equals(s2)&&s1==s2)
		{
			System.out.println("True");
		}
		else {
			System.out.println("false");
		}
		
	int n=s1.compareTo(s2);
	
	System.out.println(n);
	   
	     String s3=s1.valueOf(s1);
	     
	     System.out.println(s3);
	     
	     String s4=s1.indent(2);
	     
	     System.out.println(s4);
	
	     char[] crr= {'a','e','i','o','u'};
	     
	     String s5=null;
	     
	     s5=String.copyValueOf(crr,0,3);        // Throws StringIndexOutOfBound
	      
	     System.out.println(s5);
	
	       System.out.println(s1.subSequence(2, 10));
	       
	       
	       
	       System.out.println(s1.indent(2));  // printing String index position 
	       
	       System.out.println(s1.indexOf("is"));
	       
	       System.out.println(s1.indexOf('d'));
	       
	       System.out.println(s1.indexOf('d', 4));
	       
	       System.out.println(s1.indexOf("is",4));
	       
	       System.out.println(s1.lastIndexOf("devoloper"));
	}

}
