package com.stringTest;

import java.util.HashMap;
import java.util.Map;

public class duplicateCharacherInaString {
	public static void main(String[] args) {
		String str = "sachin sharma";
		char[] chs = str.toCharArray();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (char c : chs) {
			if (c != ' ') {
				if (!map.containsKey(c)) {
					map.put(c, 1);
				} else {
					map.put(c, map.get(c) + 1);
				}
			}
		}
		System.out.println(map);
	}
}
