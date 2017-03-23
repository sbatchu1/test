package com.java.thread;

import java.util.List;

public class Producer implements Runnable {

	private List<Integer> list;

	public Producer(List<Integer> list) {
		this.list = list;
	}

	@Override
	public void run() {
		System.out.println("Producer Incrementing the counter .....");
		synchronized (list) {
				list.add(1);
				list.notifyAll();
		}
	}

}
