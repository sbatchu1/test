package com.java.generics;

public class GenericsTest {
	public static void main(String[] args){
		String str = "abc";
		Object obj = new Object();
		
		obj = str;
		
		MyClass<String> myclassStr = new MyClass();
		MyClass<Object> myclassObject = new MyClass();
		
		//myclassObject = myclassStr;
		//myclassStr = myclassObject;
		
		obj = myclassStr;
	}
}

class MyClass<T>{
	
}
