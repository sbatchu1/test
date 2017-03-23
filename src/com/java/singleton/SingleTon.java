package com.java.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class SingleTon implements Serializable{
	private static SingleTon instance;
	private int i;
	
	private SingleTon(){
		
	}
	
    public int getI() {
        return i;
    }
 
    public void setI(int i) {
        this.i = i;
    }
	
	public static SingleTon getInstance() throws InterruptedException{
		if(null == instance){
			synchronized (SingleTon.class) {
                System.out.println("Thread entered into critical section: " + Thread.currentThread().getId());
                Thread.sleep(2000);
				if(null == instance){
					instance = new SingleTon();
				}
			}
		}
		return instance;
	}

	
	protected Object readResolve() throws ObjectStreamException{
		return instance;
	}
}
