package com.java.inheritance1;

import com.java.inheritance.SuperClass;

public class AccessingOtherPackageMembers extends SuperClass {

	public AccessingOtherPackageMembers(int id, String name) {
		super(id, name);
		// TODO Auto-generated constructor stub
	}

	public void accessingProtectedMembers() {
		System.out.println(hobbies);
		// System.out.println(qualification); Not able to access default members
		// of super class, as this class is not in the super class's package
	}
}
