package Wrapper_Class_Object;


//C:\Users\T.manohar>javap java.lang.Character
//Compiled from "Character.java"
//public final class java.lang.Character implements java.io.Serializable, java.lang.Comparable<java.lang.Character>, java.lang.constant.Constable {
//  public static final int MIN_RADIX;
//  public static final int MAX_RADIX;
//  public static final char MIN_VALUE;
//  public static final char MAX_VALUE;
//  public static final java.lang.Class<java.lang.Character> TYPE;
//  public static final byte UNASSIGNED;
//  public static final byte UPPERCASE_LETTER;
//  public static final byte LOWERCASE_LETTER;
//  public static final byte TITLECASE_LETTER;
//  public static final byte MODIFIER_LETTER;
//  public static final byte OTHER_LETTER;
//  public static final byte NON_SPACING_MARK;
//  public static final byte ENCLOSING_MARK;
//  public static final byte COMBINING_SPACING_MARK;
//  public static final byte DECIMAL_DIGIT_NUMBER;
//  public static final byte LETTER_NUMBER;
//  public static final byte OTHER_NUMBER;
//  public static final byte SPACE_SEPARATOR;
//  public static final byte LINE_SEPARATOR;
//  public static final byte PARAGRAPH_SEPARATOR;
//  public static final byte CONTROL;
//  public static final byte FORMAT;
//  public static final byte PRIVATE_USE;
//  public static final byte SURROGATE;
//  public static final byte DASH_PUNCTUATION;
//  public static final byte START_PUNCTUATION;
//  public static final byte END_PUNCTUATION;
//  public static final byte CONNECTOR_PUNCTUATION;
//  public static final byte OTHER_PUNCTUATION;
//  public static final byte MATH_SYMBOL;
//  public static final byte CURRENCY_SYMBOL;
//  public static final byte MODIFIER_SYMBOL;
//  public static final byte OTHER_SYMBOL;
//  public static final byte INITIAL_QUOTE_PUNCTUATION;
//  public static final byte FINAL_QUOTE_PUNCTUATION;
//  static final int ERROR;
//  public static final byte DIRECTIONALITY_UNDEFINED;
//  public static final byte DIRECTIONALITY_LEFT_TO_RIGHT;
//  public static final byte DIRECTIONALITY_RIGHT_TO_LEFT;
//  public static final byte DIRECTIONALITY_RIGHT_TO_LEFT_ARABIC;
//  public static final byte DIRECTIONALITY_EUROPEAN_NUMBER;
//  public static final byte DIRECTIONALITY_EUROPEAN_NUMBER_SEPARATOR;
//  public static final byte DIRECTIONALITY_EUROPEAN_NUMBER_TERMINATOR;
//  public static final byte DIRECTIONALITY_ARABIC_NUMBER;
//  public static final byte DIRECTIONALITY_COMMON_NUMBER_SEPARATOR;
//  public static final byte DIRECTIONALITY_NONSPACING_MARK;
//  public static final byte DIRECTIONALITY_BOUNDARY_NEUTRAL;
//  public static final byte DIRECTIONALITY_PARAGRAPH_SEPARATOR;
//  public static final byte DIRECTIONALITY_SEGMENT_SEPARATOR;
//  public static final byte DIRECTIONALITY_WHITESPACE;
//  public static final byte DIRECTIONALITY_OTHER_NEUTRALS;
//  public static final byte DIRECTIONALITY_LEFT_TO_RIGHT_EMBEDDING;
//  public static final byte DIRECTIONALITY_LEFT_TO_RIGHT_OVERRIDE;
//  public static final byte DIRECTIONALITY_RIGHT_TO_LEFT_EMBEDDING;
//  public static final byte DIRECTIONALITY_RIGHT_TO_LEFT_OVERRIDE;
//  public static final byte DIRECTIONALITY_POP_DIRECTIONAL_FORMAT;
//  public static final byte DIRECTIONALITY_LEFT_TO_RIGHT_ISOLATE;
//  public static final byte DIRECTIONALITY_RIGHT_TO_LEFT_ISOLATE;
//  public static final byte DIRECTIONALITY_FIRST_STRONG_ISOLATE;
//  public static final byte DIRECTIONALITY_POP_DIRECTIONAL_ISOLATE;
//  public static final char MIN_HIGH_SURROGATE;
//  public static final char MAX_HIGH_SURROGATE;
//  public static final char MIN_LOW_SURROGATE;
//  public static final char MAX_LOW_SURROGATE;
//  public static final char MIN_SURROGATE;
//  public static final char MAX_SURROGATE;
//  public static final int MIN_SUPPLEMENTARY_CODE_POINT;
//  public static final int MIN_CODE_POINT;
//  public static final int MAX_CODE_POINT;
//  public static final int SIZE;
//  public static final int BYTES;
//  static final boolean $assertionsDisabled;
//  public java.util.Optional<java.lang.constant.DynamicConstantDesc<java.lang.Character>> describeConstable();
//  public java.lang.Character(char);
//  public static java.lang.Character valueOf(char);
//  public char charValue();
//  public int hashCode();
//  public static int hashCode(char);
//  public boolean equals(java.lang.Object);
//  public java.lang.String toString();
//  public static java.lang.String toString(char);
//  public static java.lang.String toString(int);
//  public static boolean isValidCodePoint(int);
//  public static boolean isBmpCodePoint(int);
//  public static boolean isSupplementaryCodePoint(int);
//  public static boolean isHighSurrogate(char);
//  public static boolean isLowSurrogate(char);
//  public static boolean isSurrogate(char);
//  public static boolean isSurrogatePair(char, char);
//  public static int charCount(int);
//  public static int toCodePoint(char, char);
//  public static int codePointAt(java.lang.CharSequence, int);
//  public static int codePointAt(char[], int);
//  public static int codePointAt(char[], int, int);
//  static int codePointAtImpl(char[], int, int);
//  public static int codePointBefore(java.lang.CharSequence, int);
//  public static int codePointBefore(char[], int);
//  public static int codePointBefore(char[], int, int);
//  static int codePointBeforeImpl(char[], int, int);
//  public static char highSurrogate(int);
//  public static char lowSurrogate(int);
//  public static int toChars(int, char[], int);
//  public static char[] toChars(int);
//  static void toSurrogates(int, char[], int);
//  public static int codePointCount(java.lang.CharSequence, int, int);
//  public static int codePointCount(char[], int, int);
//  static int codePointCountImpl(char[], int, int);
//  public static int offsetByCodePoints(java.lang.CharSequence, int, int);
//  public static int offsetByCodePoints(char[], int, int, int, int);
//  static int offsetByCodePointsImpl(char[], int, int, int, int);
//  public static boolean isLowerCase(char);
//  public static boolean isLowerCase(int);
//  public static boolean isUpperCase(char);
//  public static boolean isUpperCase(int);
//  public static boolean isTitleCase(char);
//  public static boolean isTitleCase(int);
//  public static boolean isDigit(char);
//  public static boolean isDigit(int);
//  public static boolean isDefined(char);
//  public static boolean isDefined(int);
//  public static boolean isLetter(char);
//  public static boolean isLetter(int);
//  public static boolean isLetterOrDigit(char);
//  public static boolean isLetterOrDigit(int);
//  public static boolean isJavaLetter(char);
//  public static boolean isJavaLetterOrDigit(char);
//  public static boolean isAlphabetic(int);
//  public static boolean isIdeographic(int);
//  public static boolean isJavaIdentifierStart(char);
//  public static boolean isJavaIdentifierStart(int);
//  public static boolean isJavaIdentifierPart(char);
//  public static boolean isJavaIdentifierPart(int);
//  public static boolean isUnicodeIdentifierStart(char);
//  public static boolean isUnicodeIdentifierStart(int);
//  public static boolean isUnicodeIdentifierPart(char);
//  public static boolean isUnicodeIdentifierPart(int);
//  public static boolean isIdentifierIgnorable(char);
//  public static boolean isIdentifierIgnorable(int);
//  public static char toLowerCase(char);
//  public static int toLowerCase(int);
//  public static char toUpperCase(char);
//  public static int toUpperCase(int);
//  public static char toTitleCase(char);
//  public static int toTitleCase(int);
//  public static int digit(char, int);
//  public static int digit(int, int);
//  public static int getNumericValue(char);
//  public static int getNumericValue(int);
//  public static boolean isSpace(char);
//  public static boolean isSpaceChar(char);
//  public static boolean isSpaceChar(int);
//  public static boolean isWhitespace(char);
//  public static boolean isWhitespace(int);
//  public static boolean isISOControl(char);
//  public static boolean isISOControl(int);
//  public static int getType(char);
//  public static int getType(int);
//  public static char forDigit(int, int);
//  public static byte getDirectionality(char);
//  public static byte getDirectionality(int);
//  public static boolean isMirrored(char);
//  public static boolean isMirrored(int);
//  public int compareTo(java.lang.Character);
//  public static int compare(char, char);
//  static int toUpperCaseEx(int);
//  static char[] toUpperCaseCharArray(int);
//  public static char reverseBytes(char);
//  public static java.lang.String getName(int);
//  public static int codePointOf(java.lang.String);
//  public int compareTo(java.lang.Object);
//  static {};
//}



public class Character_O {
	public static void main(String[] args) {
		Character c=new Character('s');
		
		char c2=Character.toTitleCase('a');
		
		System.out.println(c2);
		
		
		
	}

}


