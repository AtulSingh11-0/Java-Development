package collectionFramework.queue.deque;

import java.util.ArrayDeque;
import java.util.Deque;

/*
* This class demonstrates how to implement a queue using ArrayDeque.
* */
public class QueueImplUsingArrayDeque {
	public static void main ( String[] args ) {
		Deque<Integer> queue = new ArrayDeque<>(); // ArrayDeque is a class that implements Deque interface.

		// Adding elements to the queue.
		for ( int i = 0; i < 5; i++ ) {
			queue.offerLast(i);
		}

		System.out.println("Queue: " + queue); // prints the queue.
		System.out.println("Peek: " + queue.peekFirst()); // prints the front element of the queue.
		System.out.println("Poll: " + queue.pollFirst()); // removes the front element of the queue.
		System.out.println("Queue: " + queue); // prints the queue.
		queue.offerLast(9); // adds an element to the queue.
		System.out.println("Adding 9 to it: " + queue); // prints the queue.
	}
}
/*
* We can use ArrayDeque to implement a queue. We can use the following methods to implement a queue:
* 1. offerLast() - to add an element to the queue.
* 2. pollFirst() - to remove an element from the queue.
* 3. peekFirst() - to get the front element of the queue.
* 4. isEmpty() - to check if the queue is empty.
* 5. size() - to get the size of the queue.
* 6. clear() - to clear the queue.
* 7. contains() - to check if the queue contains a specific element.
*
* The above methods are available in the Deque interface, which is implemented by ArrayDeque.
* The above code demonstrates how to implement a queue using ArrayDeque.
*
* Using ArrayDeque to implement a queue is more efficient than using a LinkedList because ArrayDeque is faster than LinkedList.
*
* */