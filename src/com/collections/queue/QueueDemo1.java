package com.collections.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo1 {

	public static void main(String[] args) {

		Queue<String> queue = new PriorityQueue<String>();
		queue.add("raj");
		queue.add("parth");
		queue.add("amit");
		queue.add("jay");
		queue.add("ajay");
		queue.add("ab");

		// queue.remove();
		//	System.out.println("removing..."+queue.poll());
		 System.out.println("peek.."+queue.peek());
		// queue.element();

		// queue.contains("raj");
		// queue.isEmpty();

		for (String s : queue) {
			System.out.println(s);
		}

	}
}
