package com.java.cache;

import com.java.test.Balloon;

public class CacheApplication {
	
	public static void main(String[] args){
		MyCache cache = new MyCache();
		
		//objects to be cached
		Balloon redBalloon = new Balloon("red");
		Balloon blueBalloon = new Balloon("blue");
		
		cache.put("redBalloon", redBalloon);
		cache.put("blueBalloon", blueBalloon);
		
		System.out.println(cache.get("redBalloon"));
		
		
	}

}
