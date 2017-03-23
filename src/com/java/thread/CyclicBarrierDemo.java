package com.java.thread;

import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierDemo {
	public static void main(String[] args){
		CyclicBarrier barrier = new CyclicBarrier(2, () -> {
			System.out.println("Start Car Assembly........");
		});
		
		CarBodyProducerP bodyThread = new CarBodyProducerP(barrier);
		CarEngineProducerP engineThread = new CarEngineProducerP(barrier);
		
		bodyThread.start();
		engineThread.start();
		
		
	}

}

class CarBodyProducerP extends Thread{
	private CyclicBarrier barrier;
	
	public CarBodyProducerP(CyclicBarrier barrier) {
		this.barrier = barrier;
	}
	@Override
	public void run(){
		System.out.println("Preparing Car Body");
		try {
			Thread.sleep(5000);
			System.out.println("Car Body Completed");
			barrier.await();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}


class CarEngineProducerP extends Thread{
	private CyclicBarrier barrier;
	
	public CarEngineProducerP(CyclicBarrier barrier) {
		this.barrier = barrier;
	}
	
	@Override
	public void run(){
		System.out.println("Preparing Car Engine");
		try {
			Thread.sleep(10000);
			System.out.println("Car Engine Completed");
			barrier.await();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}