package com.java.exceptions;

public class ExceptionDemo {

	public static void main(String[] args) {
		ExceptionDemo ed = new ExceptionDemo();
		ed.m1();
	}

	public void m1() {
		try {
			System.out.println("in try block");
			int num = 45 / 0;
			System.out.println(num);
		} catch (IndexOutOfBoundsException ie) {
			System.out.println("Caught indexoutofbounds");
		} 
		catch (ArithmeticException ae) {
			System.out.println("Caught arithematic exception :");
		} 
		finally {
			System.out.println("finally executed");
		}

		System.out.println("Normal flow after catch block");

	}
}
