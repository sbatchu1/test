package com.java.string;

public class StringDemo {
	
	public static void main(String[] args){
		String inputStr = "Hello World! I am a String";
		
		System.out.println(inputStr.charAt(10));
		
		System.out.println(inputStr.substring(1, 4));
		
		String[] splitted = inputStr.split("r");
		for(int i=0; i<splitted.length; i++)
			System.out.println(splitted[i]);
	}

}
