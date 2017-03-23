package com.java.test;

public class StringPalindrome {

	public static void main(String[] args) {
		String stringToCheck = args[0];
//		boolean success = true;
//		char[] array = stringToCheck.toCharArray();
//		int length = stringToCheck.length();
//		int halfLength = (int) length / 2;
//
//		for (int i = 0; success && i < halfLength; i++) {
//			success = (array[i] == array[length - 1 - i]);
//		}

		System.out.println("String is palindrome: " + canBeTurnedIntoAPalindrome(stringToCheck));
	}

	public static boolean canBeTurnedIntoAPalindrome(String drome) {
		// If we've found a letter that has no match, the center letter.
		boolean centerUsed = false;
		char center='\000';

		char c;
		int count = 0;

		// TODO: Remove whitespace from the string.

		// Check each letter to see if there's an even number of it.
		for (int i = 0; i < drome.length(); i++) {
			c = drome.charAt(i);
			count = 0;

			for (int j = 0; j < drome.length(); j++) {
				if (drome.charAt(j) == c)
					count++;
			}

			// If there was an odd number of those entries
			// and the center is already used, then a palindrome
			// is impossible, so return false.
			if (count % 2 == 1) {
				if (centerUsed && center != c)
					return false;
				else {
					centerUsed = true;
					center = c; // This is so when we encounter it again it
								// doesn't count it as another separate center.
				}
			}
		}
		// If we made it all the way through that loop without returning false,
		// then
		return true;
	}

}
