package com.java.test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamApiDemo {
	public static void main(String[] args){
		List<Integer> values = new ArrayList<>();
		for(int i = 0; i<100; i++){
			values.add(i);
		}
		
		values.forEach(System.out::println);
		
		int sum = values.stream().filter(i -> i > 10).mapToInt(i -> i).sum();
		values.stream().count();
		System.out.println(sum);
		
		
		Balloon[] balloons = {new Balloon("Red"), new Balloon("Green"), new Balloon("Blue")};
		Stream<Balloon> bStream = Stream.of(balloons);
		
		Stream<Balloon> redBalloons = bStream.filter(balloon -> balloon.getColor().equals("Red"));
		
		
	
	}

}
