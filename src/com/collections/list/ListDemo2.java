package com.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ListDemo2 {

	public static void main(String[] args) {
		
		
		
		List<Integer> marks = new ArrayList<Integer>();
		marks.add(100);
		marks.add(78);
		marks.add(86);
		marks.add(73);
		marks.add(67);
		marks.add(90);
		
		
		
		int removedElm = marks.remove(0);
		System.out.println("removing..."+removedElm);
		
		boolean flag = marks.remove(new Integer(733));
		System.out.println("flag "+flag);
		
		for(int i:marks) {
			
			System.out.println(i);
		}
		
		
	}
}
