package com.java.thread;

import java.util.List;

public class Producer implements Runnable {

	private List<Integer> list;

	public Producer(List<Integer> list) {
		this.list = list;
	}

	@Override
	public void run() {
		System.out.println("Incrementing the counter .....");
		synchronized (list) {
			int count = 0;
			while(true){
				list.add(count);
				if(count == 20)
				{
					list.notifyAll();
					break;
				}
				count++;
			}
		}
	}

}
