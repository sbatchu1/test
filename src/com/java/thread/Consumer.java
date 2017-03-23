package com.java.thread;

import java.util.List;

public class Consumer implements Runnable {

	private List<Integer> list;

	public Consumer(List<Integer> list) {
		this.list = list;
	}

	@Override
	public void run() {
			System.out.println(" Consumer Waiting for list");
			synchronized (list) {
				try {
				
					while(list.isEmpty()){
						list.wait();
					}
					System.out.println("wait completed :");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				list.stream().forEach((item) -> {
					System.out.println("item: " + item);
				});
			}


	}
}
