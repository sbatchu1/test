package com.java.thread;

public class SynchronizedMethodDemo {
	private static int counter = 0;

	public static void main(String[] args) {
		Runnable r = () -> {
			System.out.println(("Counter value : " + Thread.currentThread().getName() + ":::: ") + getId());
		};

		Thread t1 = new Thread(r, "One");
		t1.start();
		Thread t2 = new Thread(r, "Two");
		t2.start();

	}

	/*
	 * The idea of this method is to return unique id. But if synchronized is
	 * omitted the result will be unpredictable it may return same value for two
	 * threads
	 */
	private synchronized static int getId() {
		return counter++;
	}

}
