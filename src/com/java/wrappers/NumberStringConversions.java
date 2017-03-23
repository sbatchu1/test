package com.java.wrappers;

public class NumberStringConversions {
	public static void main(String[] args){
		if(args.length == 2){
			//converting strings to numbers
			float a = Float.valueOf(args[0]).floatValue();
			System.out.println(a);
			
			//convert numbers to string format
			String aStr = String.valueOf(a);
			String usingToString = Float.toString(a);
		}
	}

}
