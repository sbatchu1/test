package com.java.thread;

public class ThreadExtendsDemo extends Thread{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getId()+": is running");
	}
	
	public static void main(String[] args){
		for(int i = 0; i<10; i++){
			Thread myThread = new ThreadExtendsDemo();
			myThread.start();
		}
		
	}
	
	
}
