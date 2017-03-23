package com.java.thread;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class ExecutorDemo {
	public static void main(String[] args){
		ThreadFactory factory = new ThreadFactory() {
			
			@Override
			public Thread newThread(Runnable r) {
				Thread t = new Thread(r);
				return t;
			}
		};
//		ExecutorService myExecutor = Executors.newFixedThreadPool(3);
//		myExecutor.execute(new Producer());
//		myExecutor.execute(new Producer());
		System.out.println("No:of cores:"+Runtime.getRuntime().availableProcessors());
		Thread t1 = new Producer1();
		Thread t2 = new Deleter();
		t1.start();
		t2.start();
		
	}
	
	
	

}

class Producer1 extends Thread{

	@Override
	public void run() {
		System.out.println("Thread : "+Thread.currentThread().getName());
		try {
			File myFile = new File("test.txt");
			FileOutputStream fos = new FileOutputStream(myFile);
			
			for(int i =0;i<100; i++){
				System.out.println("Running: "+Thread.currentThread().getName());
				fos.write(("iteration:  "+String.valueOf(i)).getBytes());
				Thread.sleep(i*5);
			}
			
			fos.close();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}


class Deleter extends Thread{

	@Override
	public void run() {
		System.out.println("Delete Thread : "+Thread.currentThread().getName());
		try {
			File myFile = new File("test.txt");
			Thread.yield();
			boolean flag = myFile.delete();
			System.out.println(flag);
			
		} catch(Exception ex){
			ex.printStackTrace();
		}
	}
	
}
