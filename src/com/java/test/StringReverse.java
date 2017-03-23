package com.java.test;

public class StringReverse {
	public static void main(String[] args){
		String str = "sairam";
		
		System.out.println(reverse(str));
	}

	private static String reverse(String str) {
		if(str.length()<=1){
			return str;
		}
		// TODO Auto-generated method stub
		return reverse(str.substring(1))+str.charAt(0);
	}
}
