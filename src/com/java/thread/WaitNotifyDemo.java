package com.java.thread;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WaitNotifyDemo {
	public static void main(String[] args){

		List<Integer> list = new ArrayList<>();
		
		Thread producerThread = new Thread(new Producer(list));
		Thread consumerThread = new Thread(new Consumer(list));
		
		producerThread.start();
		consumerThread.start();
		
		
	}
}

