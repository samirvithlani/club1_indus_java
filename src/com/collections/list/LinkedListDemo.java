package com.collections.list;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {

		LinkedList<String> list = new LinkedList<String>();
		list.add("java");
		list.add("c");
		list.add(1, "cpp");
		list.addFirst("php");
		list.addLast("c#");
		list.add("node");
		list.offer("react");
		list.push("go");

		// remove...

		/// it will throw an exception if linkedlist is empty
		// String removedElm = list.remove(); //last / head element of linkedList
		// String removedElm = list.remove(2);
		// list.remove("php");
//		System.out.println("removing..."+removedElm);

		// list.removeFirst();
		// list.removeLast();
		System.out.println("pool" + list.poll()); // null

		System.out.println("peek." + list.peek()); // null
		System.out.println("elemet " + list.element());// exception..

		// list.peekFirst();
		// list.peekLast()

		// list.pollFirst();
		// list.pollLast();

		// list.pop(); excpetin if list is empty..
		
		
		System.out.println("contains..."+list.contains("php"));
		
		//list.isEmpty(); true / false..
		
	
		for (String s : list) {
			System.out.println(s);
		}

	}
}
