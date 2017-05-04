package com.java.test;

public class TestClass {
	public static void main(String[] args){
		TestClass cls = new TestClass();
		System.out.println(cls.m2());
	}
	
	
	public int m2(){
		int i;
		try{
			i = 20;
			return i;
		}finally{
			i = 5;
			System.out.println("hiiiiiiiiiiiiiii"+i);
			
			
		}
		
	}

}
