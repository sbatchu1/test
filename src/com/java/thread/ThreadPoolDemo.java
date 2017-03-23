package com.java.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {
	public static void main(String[] args){
		ExecutorService threadpool = Executors.newCachedThreadPool();
//		ExecutorService threadpool = Executors.newFixedThreadPool(3);
		for(int i=0; i<10; i++){
			threadpool.execute(new WorkerThread());
		}
		threadpool.shutdown();
	}

}

class WorkerThread implements Runnable
{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+"- Start");
		waitHere();
		System.out.println(Thread.currentThread().getName()+"- End");
	}
	
	public void waitHere(){
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
