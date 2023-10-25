package com.aurionpro.test;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		Map<Integer, String> nameMap = new HashMap<>();
		
		nameMap.put(1,  "Amisha");
		nameMap.put(2,  "Suraj");
		nameMap.put(3,  "Nikhil");
		
		Set<Map.Entry<Integer, String>> entrySet = nameMap.entrySet();
		
		for (Map.Entry<Integer, String> x : entrySet) {
			System.out.println(x.getKey() + " " + x.getValue());
		}
		
//		nameMap.forEach((key, value) -> {
//			System.out.println(key + " " + value);
//		});
		
		System.out.println(nameMap.containsValue("Amisha"));
		System.out.println(nameMap.remove(1));
		System.out.println(nameMap.containsValue("Amisha"));
		
		System.out.println(nameMap.get(2));
		
		Set<Integer> keySet = nameMap.keySet();
		
		for (Integer x : keySet) {
			System.out.println(nameMap.get(x));
		}
		
		nameMap.forEach((key, value) -> {
			System.out.println(key + " " + value);
		});
	}
}

