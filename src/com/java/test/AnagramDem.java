package com.java.test;

public class AnagramDem {
	public static void main(String[] args){
		String str1 = "abc";
		String str2 = "kk((";
		
		int sum1 = 0;
		
		char[] aArray = str1.toCharArray();
		for(int i =0; i<str1.length(); i++){
			sum1 = sum1+(aArray[i]);
		}
		
		int sum2 = 0;
		char[] bArray = str2.toCharArray();
		for(int i =0; i<str1.length(); i++){
			sum2 = sum2+(bArray[i]);
		}
		
		if(sum1 == sum2){
			System.out.println("Anagram");
		}
	}

}
