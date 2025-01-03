package com;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
	// PriorityQueue 
		Queue q1 = new PriorityQueue();
		q1.add(4);q1.add(10);q1.add(6);q1.add(8);q1.add(3);
		System.out.println(q1);	// it doesn't maintain the order. the first element which lower value come first
		System.out.println("Remove "+q1.poll());	// it remove 3 
		System.out.println(q1);
		System.out.println("----------------------");
		// LinkedList Queue 
		
		Queue q2 = new LinkedList();
		
		q2.add(4);q2.add(10);q2.add(6);q2.add(8);q2.add(3);
		System.out.println(q2);		// it maintain the order. 
		System.out.println("Remove "+q2.poll());	// it remove 4
		System.out.println(q2);
	}

}
