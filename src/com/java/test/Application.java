package com.java.test;

import java.util.HashSet;

public class Application {
	
	public void add(){
		
	}
	
	public int add(int a){
		return 10;
	}
	
	public int add(int a, int b){
		return a+b;
	}
	
	public int add(String a, int b){
		return b;
	}
	public static void main(String[] args){
		HashSet<EqualsDemo> hashSetObj = new HashSet<>();
		
		for(int i=0; i < 10; i++){
			hashSetObj.add(new EqualsDemo());
		}
		
		System.out.println(hashSetObj.size());
		System.out.println("Contains : "+hashSetObj.contains(new EqualsDemo()));
		
		
		Balloon red = new Balloon("Red");
		
		foo(red);
		System.out.println(red.getColor());
		
		System.out.println('Y' + 'O');
	}

	private static void foo(Balloon balloon) {
		System.out.println(balloon.getColor());
		balloon.setColor("Blue");
	}
}
