package com.yannmoisan.foobarqix;

public class Main {
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			System.out.println(process(i));
		}
	}

	/* package*/ static String process(int n) {
		final StringBuilder sb = new StringBuilder();

		processStepDivisor(sb, n);
		processStepContent(sb, n);
		processStepEmpty(sb, n);

		return sb.toString();
	}
	
	private static void processStepDivisor(StringBuilder sb, int n) {
		for (FooBarQix fbq:FooBarQix.values()) {
			if (n % fbq.value == 0) {
				sb.append(fbq.replace);
			}
		}
	}

	private static void processStepContent(StringBuilder sb, int n) {
		String s = Integer.toString(n);
		for (int j = 0; j < s.length(); j++) {
			for (FooBarQix fbq:FooBarQix.values()) {
				if (s.charAt(j) == fbq.charValue) {
					sb.append(fbq.replace);
				}
			}
		}
	}

	private static void processStepEmpty(StringBuilder sb, int n) {
		if (sb.length() == 0) {
			sb.append(n);
		}
	}	
	
	private enum FooBarQix {
		FOO("Foo", 3),
		BAR("Bar", 5),
		QIX("Qix", 7);
		
		private final String replace;
		private final int value;
		private final char charValue;
		
		private FooBarQix(String replace, int value) {
			this.replace = replace;
			this.value = value;
			this.charValue = Character.forDigit(value, 10);
		}
	}
}
