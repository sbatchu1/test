package com.java.thread;

public class ThreadRunnableDemo implements Runnable{

	public static int i = 0;
	@Override
	public void run() {
		System.out.println("Before sleep: "+i);
		try {
			System.out.println(Thread.currentThread().getName());
			System.out.println(Thread.currentThread().getPriority());
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("Interrupted by Thread:"+Thread.currentThread().getId());
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		i++;
		System.out.println("After sleep: "+i);
	}
	
	public static void main(String[] args){
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
		
		for(int i =0; i< 10; i++){
			Thread myThread = new Thread(new ThreadRunnableDemo());
			myThread.start();
		}
	}
	

}
