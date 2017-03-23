package com.java.thread;

public class SynchronizedBlockDemo {
	
	public static void main(String[] args){
		CountDown cd = new CountDown();
		Runnable r = () -> {
			synchronized (cd) {
				cd.printCount();
			}
		};

		Thread one = new Thread(r, "one");
		Thread two = new Thread(r, "two");
		
		one.start();
		two.start();
		
	}
}


class CountDown{
	public void printCount(){
		for(int i =10; i>1; i--){
			System.out.println("  ---  "+i);
		}
		System.out.println("Blast off!");
		
	}
}
