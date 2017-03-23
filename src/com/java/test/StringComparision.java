package com.java.test;

public class StringComparision {
	public static void main(String[] args){
		
		String s1 = new String("sai").intern();
		String s0 = "sai";
		String s22 = "sai";
		
		System.out.println(s1 == s0);
		
		String s2 = new String("sai");
		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		
		System.out.println(s1.substring(1));
		
		
		String str1 = "abc";
		String str2 = "bca";
		
		System.out.println("Strings are anagram: "+isAnagram(str1, str2));
		
		
		characterCount("sairamgopal");
		
		
		
	}

	private static void characterCount(String string) {
		
		int[] countArr = new int[26];
		
		char[] charArr = string.toCharArray();
		
		for(int i=0; i<charArr.length; i++)
		{
			countArr[charArr[i]-97]++;
		}
		
		for(int i=0; i<countArr.length; i++){
			if(countArr[i] > 0)
			System.out.println((char)(97+i) +" = "+countArr[i]);
		}
	}

	private static boolean isAnagram(String str1, String str2) {
		if(str1 == str2)
			return true;
		
		if(str1 == null || str2 == null)
			return false;
		
		if(str1.length() != str2.length())
			return false;
		
		char[] aArr = str1.toCharArray();
		char[] bArr = str2.toCharArray();
		int[] counts = new int[26];
		
		for(int i=0; i<aArr.length; i++)
		{
			counts[aArr[i]-97]++;
			counts[bArr[i]-97]--;
		}
		
		for(int i=0; i<26; i++)
		{
			if(counts[i] != 0)
				return false;
		}
		
		
		return true;
		
	}
}
