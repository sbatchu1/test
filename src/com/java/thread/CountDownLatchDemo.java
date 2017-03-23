package com.java.thread;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchDemo {
	public static void main(String[] args){
		CountDownLatch latch = new CountDownLatch(2);
		CarBodyProducer bodyThread = new CarBodyProducer(latch);
		CarEngineProducer engineThread = new CarEngineProducer(latch);
		bodyThread.start();
		engineThread.start();
		prepareCar(latch);
	}

	private static void prepareCar(CountDownLatch latch) {
		try {
			latch.await();
			System.out.println("Car Manufacturing Completed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}


class CarBodyProducer extends Thread{
	private CountDownLatch latch;
	
	CarBodyProducer(CountDownLatch latch){
		this.latch = latch;
	}
	
	@Override
	public void run(){
		System.out.println("Preparing Car Body");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		latch.countDown();
		System.out.println("Car Body Completed");
	}
}

class CarEngineProducer extends Thread{
	private CountDownLatch latch;
	public CarEngineProducer(CountDownLatch latch) {
		this.latch = latch;
	}
	@Override
	public void run(){
		System.out.println("Preparing Car Engine");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		latch.countDown();
		System.out.println("Car Engine Completed");
	}
}
