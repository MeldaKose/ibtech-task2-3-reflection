package com.meldakose.bag;

import java.util.HashMap;
import java.util.Map;

public class DataBag {
	
	private Map<Keys,Object> hmap=new HashMap<>();

	public Map<Keys, Object> getHmap() {
		return hmap;
	}

	public void setHmap(Map<Keys, Object> hmap) {
		this.hmap = hmap;
	}
	
	public void put(Keys key, Object object) {
		hmap.put(key, object);
	}
	
	public Object get(Keys key) {
		return hmap.get(key);
	}
	
}
