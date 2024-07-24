package collectionFramework.queue.deque;

import java.util.ArrayDeque;
import java.util.Deque;

/*
* This class demonstrates the use of ArrayDeque class.
* */
public class ArrayDequeImpl {
	public static void main ( String[] args ) {
		Deque<Integer> deque = new ArrayDeque<>(); // Creating an ArrayDeque

		// Adding elements to the deque
		for ( int i = 0; i < 5; i++ ) {
			deque.offer(i);
		}

		System.out.println("Deque is: " + deque); // prints the deque
		System.out.println("Peeked element: " + deque.peek()); // returns the head of the deque
		System.out.println("Removed element: " + deque.poll()); // removes and returns the head of the deque
		System.out.println("Peeked element: " + deque.peek()); // returns the head of the deque
		System.out.println("Deque is: " + deque); // prints the deque
	}
}
/*
* We can use the ArrayDeque class to create a deque. The ArrayDeque class is a resizable array implementation of the Deque interface.
* The ArrayDeque class provides all the methods to perform the deque operations.
*
* The offer() method is used to add an element to the deque. It returns true if the element is added successfully, otherwise false.
* The poll() method is used to remove and return the head of the deque. It returns null if the deque is empty.
* The peek() method is used to return the head of the deque. It returns null if the deque is empty.
*
* Deque is used to store the elements in a double-ended queue.
* The elements are added at the end of the deque and removed from the front of the deque.
*
* We can also implement stack and queue using the ArrayDeque class.
* by using the offerFirst(), pollFirst(), and peekFirst() methods for stack operations and offerLast(), pollFirst(), and peekFirst() methods for queue operations.
*
* The ArrayDeque class provides all the methods to perform the stack and queue operations.
* The ArrayDeque class is more efficient than the Stack and LinkedList classes for stack and queue operations.
* The ArrayDeque class is faster than the Stack and LinkedList classes because it does not require synchronization.
* The ArrayDeque class is a resizable array implementation of the Deque interface.
* The ArrayDeque class provides all the methods to perform the deque operations.
* The ArrayDeque class is not synchronized, so it is not thread-safe.
*
* */