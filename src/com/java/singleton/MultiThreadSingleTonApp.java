package com.java.singleton;

public class MultiThreadSingleTonApp {
	
	public static void main(String[] args){
		
		Thread t1 = new Thread(){
			@Override
			public void run(){
				try {
					SingleTon single = SingleTon.getInstance();
					single.setI(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		
		Thread t2 = new Thread(){
			@Override
			public void run(){
				try {
					SingleTon single = SingleTon.getInstance();
					System.out.println("Thread : "+Thread.currentThread().getId() + " ---- i = "+single.getI());
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		
		Thread t3 = new Thread(){
			@Override
			public void run(){
				try {
					SingleTon single = SingleTon.getInstance();
					System.out.println("Thread : "+Thread.currentThread().getId() + " ---- i = "+single.getI());
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		
		t1.start();
		t2.start();
		t3.start();
		
	}

}
