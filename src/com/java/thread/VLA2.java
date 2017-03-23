package com.java.thread;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class VLA2 implements Comparator<VLA2>{
	int dishSize;
	
	public VLA2(int i){
		dishSize = i;
	}
	
	public static void main(String[] args) {
		
//		VLA2[] va = {new VLA2(40), new VLA2(200), new VLA2(60)};
//		Arrays.sort(va, va[0]);
//		int index = Arrays.binarySearch(va, new VLA2(40), va[0]);
//		System.out.println(index);
//		
//		index = Arrays.binarySearch(va, new VLA2(80), va[0]);
//		System.out.println(index);
//		// TODO Auto-generated method stub
		
//		PriorityQueue q = new PriorityQueue<>();
//		q.add("dishes");
//		q.add("laundry");
//		q.add("bills");
//		q.offer("bills");
//		System.out.println(q.size() + " " + q.poll());
//		System.out.println(q.peek() + " " + q.poll());
//		System.out.println(q.poll() + " " + q.poll());
		
		double d = 10.0/-0;
		if(d == Double.POSITIVE_INFINITY) 
			System.out.println(10.0/-0);
		else 
			System.out.println("000000");
	}

	@Override
	public int compare(VLA2 o1, VLA2 o2) {
		// TODO Auto-generated method stub
		return o2.dishSize - o1.dishSize;
	}

}
