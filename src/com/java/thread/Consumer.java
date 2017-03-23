package com.java.thread;

import java.util.List;

public class Consumer implements Runnable {

	private List<Integer> list;

	public Consumer(List<Integer> list) {
		this.list = list;
	}

	@Override
	public void run() {
		System.out.println("Consumer run():");

		while (list.isEmpty()) {
			synchronized (list) {
				try {
					System.out.println(" Before Wait");
					list.wait();
					System.out.println("After wait:");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

		list.stream().forEach((item) -> {
			System.out.println("item: " + item);
		});
	}
}
