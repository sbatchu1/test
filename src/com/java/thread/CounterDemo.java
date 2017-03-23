package com.java.thread;

public class CounterDemo {
	public static void main(String[] args) throws InterruptedException{
		MyCounter counter = new MyCounter();
		Thread increment = new Thread(new Thread1(counter));
		Thread decrement = new Thread(new Thread2(counter));
		
//		increment.start();
		decrement.start();
		
//		System.out.println(counter.value());
	}

}

class Thread1 implements Runnable{
	MyCounter counter;
	
	Thread1(MyCounter counter){
		this.counter = counter;
	}

	@Override
	public void run() {
		counter.increment();
	}
	
}

class Thread2 implements Runnable{
	MyCounter counter;
	
	Thread2(MyCounter counter){
		this.counter = counter;
	}

	@Override
	public void run() {
		counter.decrement();
	}
	
}

class Counter{
	private int c = 0;
	
	public void increment(){
		System.out.println("incremented :"+ ++c);
	}
	
	public void decrement(){
		System.out.println("Decremented :"+ --c);
	}
	
	public int value(){
		return c;
	}
}
