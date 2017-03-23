package com.java.polymorphism;

public class ChildClass extends ParentClass{
	private String address;

	public ChildClass(int id, String name, String address) {
		super(id, name);
		this.address = address;
	}

	public void printChildsContents(){
		System.out.println(address);
	}
}
