package Wrapper_Class_Object;


//javap java.lang.Integer
//Compiled from "Integer.java"
//public final class java.lang.Integer extends java.lang.Number implements java.lang.Comparable<java.lang.Integer>, java.lang.constant.Constable, java.lang.constant.ConstantDesc {
// public static final int MIN_VALUE;
// public static final int MAX_VALUE;
// public static final java.lang.Class<java.lang.Integer> TYPE;
// static final char[] digits;
// static final byte[] DigitTens;
// static final byte[] DigitOnes;
// static final int[] sizeTable;
// public static final int SIZE;
// public static final int BYTES;
// public static java.lang.String toString(int, int);
// public static java.lang.String toUnsignedString(int, int);
// public static java.lang.String toHexString(int);
// public static java.lang.String toOctalString(int);
// public static java.lang.String toBinaryString(int);
// public static java.lang.String toString(int);
// public static java.lang.String toUnsignedString(int);
// static int getChars(int, int, byte[]);
// static int stringSize(int);
// public static int parseInt(java.lang.String, int) throws java.lang.NumberFormatException;
// public static int parseInt(java.lang.CharSequence, int, int, int) throws java.lang.NumberFormatException;
// public static int parseInt(java.lang.String) throws java.lang.NumberFormatException;
// public static int parseUnsignedInt(java.lang.String, int) throws java.lang.NumberFormatException;
// public static int parseUnsignedInt(java.lang.CharSequence, int, int, int) throws java.lang.NumberFormatException;
// public static int parseUnsignedInt(java.lang.String) throws java.lang.NumberFormatException;
// public static java.lang.Integer valueOf(java.lang.String, int) throws java.lang.NumberFormatException;
// public static java.lang.Integer valueOf(java.lang.String) throws java.lang.NumberFormatException;
// public static java.lang.Integer valueOf(int);
// public java.lang.Integer(int);
// public java.lang.Integer(java.lang.String) throws java.lang.NumberFormatException;
// public byte byteValue();
// public short shortValue();
// public int intValue();
// public long longValue();
// public float floatValue();
// public double doubleValue();
// public java.lang.String toString();
// public int hashCode();
// public static int hashCode(int);
// public boolean equals(java.lang.Object);
// public static java.lang.Integer getInteger(java.lang.String);
// public static java.lang.Integer getInteger(java.lang.String, int);
// public static java.lang.Integer getInteger(java.lang.String, java.lang.Integer);
// public static java.lang.Integer decode(java.lang.String) throws java.lang.NumberFormatException;
// public int compareTo(java.lang.Integer);
// public static int compare(int, int);
// public static int compareUnsigned(int, int);
// public static long toUnsignedLong(int);
// public static int divideUnsigned(int, int);
// public static int remainderUnsigned(int, int);
// public static int highestOneBit(int);
// public static int lowestOneBit(int);
// public static int numberOfLeadingZeros(int);
// public static int numberOfTrailingZeros(int);
// public static int bitCount(int);
// public static int rotateLeft(int, int);
// public static int rotateRight(int, int);
// public static int reverse(int);
// public static int compress(int, int);
// public static int expand(int, int);
// public static int signum(int);
// public static int reverseBytes(int);
// public static int sum(int, int);
// public static int max(int, int);
// public static int min(int, int);
// public java.util.Optional<java.lang.Integer> describeConstable();
// public java.lang.Integer resolveConstantDesc(java.lang.invoke.MethodHandles$Lookup);
// public int compareTo(java.lang.Object);
// public java.lang.Object resolveConstantDesc(java.lang.invoke.MethodHandles$Lookup) throws java.lang.ReflectiveOperationException;
// static {};
//}


public class Integer_O {
	
	public static void main(String[] args) {
	  
		Integer ob=new Integer(120);
		
		System.out.println(ob);
		
		String s=ob.toBinaryString(ob);
		
		System.out.println(s);
		
		Integer i1=Integer.parseInt(s,2);
		
		System.out.println(i1);
		
		
		String s1=Integer.toOctalString(12);
		
		System.out.println(s1);
		
		
		String s3=Integer.toHexString(123);
		
		System.out.println(s3);
		
		
		int n=ob.intValue();
		
		System.out.println(n);
		
		int n1=Integer.reverse(123);
		
		System.out.println(n1);
		
		
		
		
	}

}
