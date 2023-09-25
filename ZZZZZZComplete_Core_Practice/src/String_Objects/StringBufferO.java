package String_Objects;


//C:\Users\T.manohar>javap java.lang.StringBuffer
//Compiled from "StringBuffer.java"
//public final class java.lang.StringBuffer extends java.lang.AbstractStringBuilder implements java.io.Serializable, java.lang.Comparable<java.lang.StringBuffer>, java.lang.CharSequence {
//  static final long serialVersionUID;
//  public java.lang.StringBuffer();
//  public java.lang.StringBuffer(int);
//  public java.lang.StringBuffer(java.lang.String);
//  public java.lang.StringBuffer(java.lang.CharSequence);
//  public synchronized int compareTo(java.lang.StringBuffer);
//  public synchronized int length();
//  public synchronized int capacity();
//  public synchronized void ensureCapacity(int);
//  public synchronized void trimToSize();
//  public synchronized void setLength(int);
//  public synchronized char charAt(int);
//  public synchronized int codePointAt(int);
//  public synchronized int codePointBefore(int);
//  public synchronized int codePointCount(int, int);
//  public synchronized int offsetByCodePoints(int, int);
//  public synchronized void getChars(int, int, char[], int);
//  public synchronized void setCharAt(int, char);
//  public synchronized java.lang.StringBuffer append(java.lang.Object);
//  public synchronized java.lang.StringBuffer append(java.lang.String);
//  public synchronized java.lang.StringBuffer append(java.lang.StringBuffer);
//  synchronized java.lang.StringBuffer append(java.lang.AbstractStringBuilder);
//  public synchronized java.lang.StringBuffer append(java.lang.CharSequence);
//  public synchronized java.lang.StringBuffer append(java.lang.CharSequence, int, int);
//  public synchronized java.lang.StringBuffer append(char[]);
//  public synchronized java.lang.StringBuffer append(char[], int, int);
//  public synchronized java.lang.StringBuffer append(boolean);
//  public synchronized java.lang.StringBuffer append(char);
//  public synchronized java.lang.StringBuffer append(int);
//  public synchronized java.lang.StringBuffer appendCodePoint(int);
//  public synchronized java.lang.StringBuffer append(long);
//  public synchronized java.lang.StringBuffer append(float);
//  public synchronized java.lang.StringBuffer append(double);
//  public synchronized java.lang.StringBuffer delete(int, int);
//  public synchronized java.lang.StringBuffer deleteCharAt(int);
//  public synchronized java.lang.StringBuffer replace(int, int, java.lang.String);
//  public synchronized java.lang.String substring(int);
//  public synchronized java.lang.CharSequence subSequence(int, int);
//  public synchronized java.lang.String substring(int, int);
//  public synchronized java.lang.StringBuffer insert(int, char[], int, int);
//  public synchronized java.lang.StringBuffer insert(int, java.lang.Object);
//  public synchronized java.lang.StringBuffer insert(int, java.lang.String);
//  public synchronized java.lang.StringBuffer insert(int, char[]);
//  public java.lang.StringBuffer insert(int, java.lang.CharSequence);
//  public synchronized java.lang.StringBuffer insert(int, java.lang.CharSequence, int, int);
//  public java.lang.StringBuffer insert(int, boolean);
//  public synchronized java.lang.StringBuffer insert(int, char);
//  public java.lang.StringBuffer insert(int, int);
//  public java.lang.StringBuffer insert(int, long);
//  public java.lang.StringBuffer insert(int, float);
//  public java.lang.StringBuffer insert(int, double);
//  public int indexOf(java.lang.String);
//  public synchronized int indexOf(java.lang.String, int);
//  public int lastIndexOf(java.lang.String);
//  public synchronized int lastIndexOf(java.lang.String, int);
//  public synchronized java.lang.StringBuffer reverse();
//  public synchronized java.lang.String toString();
//  synchronized void getBytes(byte[], int, byte);
//  public java.util.stream.IntStream codePoints();
//  public java.util.stream.IntStream chars();
//  public java.lang.AbstractStringBuilder reverse();
//  public java.lang.AbstractStringBuilder insert(int, double);
//  public java.lang.AbstractStringBuilder insert(int, float);
//  public java.lang.AbstractStringBuilder insert(int, long);
//  public java.lang.AbstractStringBuilder insert(int, int);
//  public java.lang.AbstractStringBuilder insert(int, char);
//  public java.lang.AbstractStringBuilder insert(int, boolean);
//  public java.lang.AbstractStringBuilder insert(int, java.lang.CharSequence, int, int);
//  public java.lang.AbstractStringBuilder insert(int, java.lang.CharSequence);
//  public java.lang.AbstractStringBuilder insert(int, char[]);
//  public java.lang.AbstractStringBuilder insert(int, java.lang.String);
//  public java.lang.AbstractStringBuilder insert(int, java.lang.Object);
//  public java.lang.AbstractStringBuilder insert(int, char[], int, int);
//  public java.lang.AbstractStringBuilder replace(int, int, java.lang.String);
//  public java.lang.AbstractStringBuilder deleteCharAt(int);
//  public java.lang.AbstractStringBuilder appendCodePoint(int);
//  public java.lang.AbstractStringBuilder delete(int, int);
//  public java.lang.AbstractStringBuilder append(double);
//  public java.lang.AbstractStringBuilder append(float);
//  public java.lang.AbstractStringBuilder append(long);
//  public java.lang.AbstractStringBuilder append(int);
//  public java.lang.AbstractStringBuilder append(char);
//  public java.lang.AbstractStringBuilder append(boolean);
//  public java.lang.AbstractStringBuilder append(char[], int, int);
//  public java.lang.AbstractStringBuilder append(char[]);
//  public java.lang.AbstractStringBuilder append(java.lang.CharSequence, int, int);
//  public java.lang.AbstractStringBuilder append(java.lang.CharSequence);
//  java.lang.AbstractStringBuilder append(java.lang.AbstractStringBuilder);
//  public java.lang.AbstractStringBuilder append(java.lang.StringBuffer);
//  public java.lang.AbstractStringBuilder append(java.lang.String);
//  public java.lang.AbstractStringBuilder append(java.lang.Object);
//  public java.lang.Appendable append(char) throws java.io.IOException;
//  public java.lang.Appendable append(java.lang.CharSequence, int, int) throws java.io.IOException;
//  public java.lang.Appendable append(java.lang.CharSequence) throws java.io.IOException;
//  public int compareTo(java.lang.Object);
//  static {};
//}


public class StringBufferO {
	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer();
		 
		sb.append("    manohar java developer ");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		
		sb.ensureCapacity(1000);
		
		System.out.println(sb.capacity());
		
		
		
		
		
		
		
	}
	

}
