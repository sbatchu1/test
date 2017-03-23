package com.java.thread;

public class ThreadJoinDemo {

	public static void main(String[] args) throws InterruptedException {
		ThreadJoin t1 = new ThreadJoin("t1");
		ThreadJoin t2 = new ThreadJoin("t2");
		ThreadJoin t3 = new ThreadJoin("t3");
		t1.start();
		//t1.join();
		t2.start();
		//t2.join();
		t3.start();
	}
}

class ThreadJoin extends Thread {
	public ThreadJoin(String name){
		super(name);
	}
	
	public void run(){
		for(int i =1; i<=5; i++){
			try {
				System.out.println("ThreadJoin.run() " + Thread.currentThread().getId());
				Thread.sleep(10000);
//				if(this.getName().equals("t2")){
//					Thread.sleep(500);
//				}
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(Thread.currentThread().getName() + " i= "+i);
		}
	}

}
