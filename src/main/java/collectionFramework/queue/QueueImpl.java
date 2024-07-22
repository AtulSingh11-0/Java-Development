package collectionFramework.queue;

import java.util.LinkedList;
import java.util.Queue;

/*
* This class demonstrates the use of Queue interface and its implementation class LinkedList.
* */
public class QueueImpl {
	public static void main ( String[] args ) {
		Queue<Integer> queue = new LinkedList<>(); // Queue is an interface and LinkedList is its implementation class

		// Adding elements to the queue
		for ( int i = 0; i < 5; i++ ) {
			queue.offer(i);
		}

		System.out.println("Queue is: " + queue); // prints the queue
		System.out.println("Removed element: " + queue.poll()); // removes and returns the head of the queue
		System.out.println("Queue is: " + queue); // prints the queue
		System.out.println("Head of the queue: " + queue.peek()); // returns the head of the queue
	}
}
/*
* We can use the Queue interface to create a queue. The LinkedList class implements the Queue interface.
* We can create a queue using the LinkedList class. The LinkedList class provides all the methods to perform the queue operations.
*
* The offer() method is used to add an element to the queue. It returns true if the element is added successfully, otherwise false.
* The poll() method is used to remove and return the head of the queue. It returns null if the queue is empty.
* The peek() method is used to return the head of the queue. It returns null if the queue is empty.
*
* Queue is used to store the elements in a FIFO (First In First Out) order.
* The elements are added at the end of the queue and removed from the front of the queue.
*
* */