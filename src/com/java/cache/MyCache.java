package com.java.cache;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MyCache {
	
	private Map<String, Object> appCache = new ConcurrentHashMap<>();
	
	public void put(String key, Object value){
	}
	
	public Object get(String key){
		Object cachedValue = appCache.get(key);
		
		if(null == cachedValue){
			//get from db and return
			//return dbValue;
		}
		return cachedValue;
	}
	
	public void remove(String key){
		appCache.remove(key);
	}
 
}
