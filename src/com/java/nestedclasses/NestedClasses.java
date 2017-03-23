package com.java.nestedclasses;

public class NestedClasses {
	private int id;
	String name;
	protected String address;
	
	
	public void outerClassMethod(){
		System.out.println("I am from outer class");
	}
	
	//Non-Static nested class or Inner class. can access all the members of outer class
	class NonStaticNestedClass{
		void accessOuterClassMembers(){
			System.out.println(id);
			System.out.println(name);
			System.out.println(address);
			outerClassMethod();
		}
	}
	
	//Static nested class can not access outer class instance members
	static class StaticNestedClass{
	}

}
