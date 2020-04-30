package com.imc;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		HashMap <Integer, String> hm = new HashMap<Integer,String>();
		hm.put(1, "Mahesh Chary");
		hm.put(2, "Maru");
		hm.put(3, "Harish");
		Iterator<Map.Entry<Integer, String>> itr = hm.entrySet().iterator();
		while(itr.hasNext()) {
			Map.Entry<Integer, String> entry = itr.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		
	}
}
