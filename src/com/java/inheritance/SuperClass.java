package com.java.inheritance;

public class SuperClass {

	private int id;
	private String name;
	protected String hobbies;
	String qualification;

	public SuperClass(int id, String name) {
		this.id = id;
		this.name = name;
		// we can write try, catch in constructor
		try {

		} catch (ArithmeticException ae) {
			throw ae;
		}
	}

	{
		// these are called initializer blocks. this code will be copied to all
		// the constructors. nothing but this code is common to all constructors
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int m1(){
		System.out.println("I am from super class");
		return 0;
	}

}
