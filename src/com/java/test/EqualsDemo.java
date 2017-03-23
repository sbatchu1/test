package com.java.test;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class EqualsDemo {
	public static void main(String[] args) {
		HashMap<Balloon, String> myMap = new HashMap<>();
		
		Balloon balloon = new Balloon("Red");
		
		myMap.put(balloon, "Sai Ram");
		myMap.put(balloon, "Vijaya");
		System.out.println(myMap.size());
		System.out.println(myMap.get(balloon) );
		
				List<Integer> myList = Arrays.asList(1,2,3,4,5,6,7,8);
				List<Integer> evens = myList.stream().filter(n -> n % 2 == 0 ).collect(Collectors.toList());
			//	List<Integer> odds = myList.parallelStream().filter(n -> n%2==1).collect(Collectors.toList());
				System.out.println(evens);
			//	System.out.println(odds);
				
				System.out.println(new Date().toString());
				//long sum = IntStream.range(1, 500000).filter(n -> { return n % 2 == 0; }).mapToLong(n -> n).sum();
				
				myList.stream().forEach(n -> {System.out.println(n*2);});
		

	}
}
