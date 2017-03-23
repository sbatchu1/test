package com.java.statics;

//1) Instance methods can access instance variables and instance methods directly.
//2) Instance methods can access class variables and class methods directly.
//3) Class methods can access class variables and class methods directly.
//4) Class methods cannot access instance variables or instance methods directly—they must use an object reference.
//   Also, class methods cannot use the this keyword as there is no instance for this to refer to.
public class StaticDemo {

	private int id;
	private String name;
	private static int objectCount = 0;
	public static final double PI =3.141;

	public static void incrementObjectCount() {
		objectCount++;
		// static methods can't access instance members
		// System.out.println(id);
		// instanceMethod1();
		System.out.println(PI);
	}

	public void instanceMethod1() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(objectCount);// instance methods can access static
										// members(methods also)
		incrementObjectCount();// accessing static method
	}
}
