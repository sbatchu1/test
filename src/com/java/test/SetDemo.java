package com.java.test;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
	public static void main(String[] args){
		int count[] = {11, 22, 33, 44, 55};
		Set<Integer> myset = new HashSet<>();
		
		for(int i = 0; i< 4; i++){
			myset.add(count[i]);
		}
		
		System.out.println(myset);
		
		TreeSet<Integer> myTreeSet = new TreeSet<>(myset);
		System.out.println(myTreeSet);
	}

}
