package com.java.thread;

import java.util.ArrayList;
import java.util.List;

public class DeadLock {
	public static void main(String[] args) {
		
		List<String> res1 = new ArrayList<>();
		List<String> res2 = new ArrayList<>();
		
		Runnable t1 = () -> {
			synchronized (res1) {
				//Some processing
				System.out.println("T1 waiting for res2");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				synchronized (res2) {
					//processing complete
					System.out.println("T1 completed processing");
				}
			}
		};
		
		
		
		Runnable t2 = () -> {
			synchronized (res2) {
				//Some processing
				System.out.println("T2 waiting for res1");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				synchronized (res1) {
					//processing complete
					System.out.println("T2 completed processing");
				}
			}
		};
		
		
		//start the threads
		Thread one = new Thread(t1);
		Thread two = new Thread(t2);
		
		one.start();
		two.start();
		
	}

}
