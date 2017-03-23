package com.java.inheritance;

public class SubClass extends SuperClass {
	private String address;
	private String designation;
	
	public SubClass() {
		super(10, "sairam");
	}
	
	public SubClass(String address, String designation){
		this();
		super(10, "sairam");
	}
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	public void accessingSuperClassProtected(){
		System.out.println(hobbies);
	}
	
	public void accessingSuperClassDefault(){
		System.out.println(qualification);
	}

	//Cannot reduce the visibility of the inherited method from SuperClass. you can not make a super class public to private in subclass
	@Override
	public int m1() {
		System.out.println("I am from sub class");
		return 1;
	}
	
	
}
