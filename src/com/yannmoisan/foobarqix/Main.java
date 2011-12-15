package com.yannmoisan.foobarqix;

public class Main {

	private static final String[] SUBSTITUTION_WORDS = new String[] { "Foo", "Bar", "Qix" };
	private static final char[] DIGITS = { '3', '5', '7' };
	private static final int[] DIVISORS = new int[] { 3, 5, 7 };
	
	private static final int MAX_INDEX = 100;

	public static void main(String[] args) {
		for (int i = 1; i <= MAX_INDEX; i++) {
			System.out.println(process(i));
		}
	}

	/* package*/ static String process(int n) {
		StringBuilder sb = new StringBuilder();

		processDivisor(sb, n);
		processContent(sb, n);
		processEmpty(sb, n);

		return sb.toString();
	}
	
	private static void processDivisor(StringBuilder sb, int n) {
		for (int i = 0; i < SUBSTITUTION_WORDS.length; i++) {
			if (n % DIVISORS[i] == 0) {
				sb.append(SUBSTITUTION_WORDS[i]);
			}
		}
	}

	private static void processContent(StringBuilder sb, int n) {
		String s = Integer.toString(n);
		for (int j = 0; j < s.length(); j++) {
			for (int k = 0; k < SUBSTITUTION_WORDS.length; k++) {
				if (s.charAt(j) == DIGITS[k]) {
					sb.append(SUBSTITUTION_WORDS[k]);
				}
			}
		}
	}

	private static void processEmpty(StringBuilder sb, int n) {
		if (sb.length() == 0) {
			sb.append(n);
		}
	}	
}
