package com.java.polymorphism;

public class ParentClass {
	private int id;
	private String name;
	
	public ParentClass(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	
	public void printContents(){
		System.out.println(id);
		System.out.println(name);
	}
}
