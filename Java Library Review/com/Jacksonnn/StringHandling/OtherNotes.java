package com.Jacksonnn.StringHandling;

public class OtherNotes {

	public static void main(String[] args) {
		//charAt()
			char ch;
			ch = "abc".charAt(1);
			System.out.println(ch);
		
		//getChars()
			String s = "This is a demo of the getChars method.";
			int start = 10;
			int end = 14;
			char buf[] = new char[end - start];
			
			s.getChars(start,  end, buf, 0);
			System.out.println(buf);
			
		/*
		 * Various other examples:
		 * getBytes():
		 * 		byte[] getBytes();
		 * 
		 * toCharArray():
		 * 		char[] toCharAway();
		 * 
		 * startsWith():
		 * 		boolean startsWith();
		 * 
		 * endsWith():
		 * 		boolean endsWith();
		 * 
		 * indexOf():
		 * 		int indexOf(int ch);
		 * 		int indexOf(String str);
		 * 
		 * lastIndexOf():
		 * 		int lastIndexOf(int ch);
		 * 		int lastIndexOf(String str);
		 * 
		 * valueOf():
		 * 		static String valueOf(double num);
		 * 		static String valueOf(long num);
		 * 		static String valueOf(Object ob);
		 * 		static String valueOf(char chars[]);
		 * 
		 * codePointAt();
		 * 		int codePointAt(int i);
		 * 
		 * codePointBefore();
		 * 		int codePointBefore(int i);
		 * 
		 * codePointCount();
		 * 		int codePointCount(int start, int end);
		 * 
		 * contains();
		 * 		boolean contains(CharSequence str);
		 * 
		 * contentEquals();
		 * 		boolean contentEquals(CharSequence str);
		 * 		boolean contentEquals(StringBuffer str);
		 * 
		 * format();
		 * 		static String format(String smtstr, Object ... args);
		 * 		static String format(Locale loc, String fmtstr, Object ... args);
		 * 
		 * isEmpty();
		 * 		boolean isEmpty();
		 * 
		 * matches();
		 * 		boolean matches(string regExp);
		 * 
		 * offsetByCodePoints();
		 * 		int offsetByCodePoints(int start, int num);
		 * 
		 * replaceFirst();
		 * 		String replaceFirst(String regExp, String newStr);
		 * 
		 * replaceAll();
		 * 		String replaceAll(String regExp, String newStr);
		 * 
		 * split();
		 * 		String[] split(String regExp);
		 * 		String[] split(String regExp, int max);
		 * 
		 * subSequence();
		 * 		CharSequence subSequence(int startIndex, int stopIndex);
		 * 
		 * StringBuffer:
		 * 		StringBuffer();
		 * 		StringBuffer(int size);
		 * 		StringBuffer(String str);
		 * 		StringBuffer(CharSequence chars);
		 * 
		 * ensureCapacity();
		 * 		void ensureCapacity(int minCapacity);
		 * 
		 * setLength();
		 * 		void setLength(int len);
		 * 
		 * getChars();
		 * 		void getChars(int sourceStat, int sourceEnd, char target[], int targetStart);
		 * 
		 * 
		 */
	}

}
