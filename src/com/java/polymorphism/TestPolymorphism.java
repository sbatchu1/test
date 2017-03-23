package com.java.polymorphism;

public class TestPolymorphism {
	public static void main(String[] args){
		ParentClass parent = new ChildClass(1, "sai ram", "kuchipudi"); //parent class ref can hold child class object
		//ChildClass child = new Parent(); child class ref can not hold parent class object
		parent.printContents();
		//parent.printChildsContents(); also child class's members are not visible to parent's ref variable
	}
}
