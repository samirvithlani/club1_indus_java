package com.collections.map;

import java.util.HashMap;
import java.util.Map;

class Books {

	int bId;
	String bNa;

	public Books(int bId, String bNa) {

		this.bId = bId;
		this.bNa = bNa;
	};

}

public class MapDemo2 {

	public static void main(String[] args) {

		Map<String, Books> bookMap = new HashMap<String, Books>();
		bookMap.put("ram", new Books(1, "ayodhya"));
		bookMap.put("elon", new Books(102, "tesla"));

		for (Map.Entry m : bookMap.entrySet()) {

			System.out.println(m.getKey());
			//System.out.println(m.getValue());
			Books b = (Books)m.getValue();
			System.out.println(b.bId + " "+b.bNa);
			

		}

	}
}
