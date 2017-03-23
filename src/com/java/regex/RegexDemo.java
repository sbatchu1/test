package com.java.regex;

import java.util.regex.Pattern;

public class RegexDemo {
	public static void main(String[] args){
		boolean result = Pattern.matches("\\w", "sairam2");
		System.out.println(result);
	}

}
