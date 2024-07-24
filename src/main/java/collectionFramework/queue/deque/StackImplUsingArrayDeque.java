package collectionFramework.queue.deque;

import java.util.ArrayDeque;
import java.util.Deque;

/*
* This class demonstrates how to implement a stack using ArrayDeque.
* */
public class StackImplUsingArrayDeque {
	public static void main ( String[] args ) {
		Deque<Integer> stack = new ArrayDeque<>(); // ArrayDeque is a class that implements Deque interface.

		// Adding elements to the stack.
		for ( int i = 0; i < 5; i++ ) {
			stack.offerFirst(i);
		}

		System.out.println("Stack: " + stack); // prints the stack.
		System.out.println("Peek: " + stack.peekFirst()); // prints the top element of the stack.
		System.out.println("Pop: " + stack.pollFirst()); // removes the top element of the stack.
		System.out.println("Stack :" + stack); // prints the stack.
		stack.offerFirst(9); // adds an element to the stack.
		System.out.println("Adding 9 to it: " + stack); // prints the stack.
	}
}
/*
* We can use ArrayDeque to implement a stack. We can use the following methods to implement a stack:
* 1. offerFirst() - to push an element to the stack.
* 2. pollFirst() - to pop an element from the stack.
* 3. peekFirst() - to get the top element of the stack.
* 4. isEmpty() - to check if the stack is empty.
* 5. size() - to get the size of the stack.
* 6. clear() - to clear the stack.
* 7. contains() - to check if the stack contains a specific element.
*
* The above methods are available in the Deque interface, which is implemented by ArrayDeque.
* The above code demonstrates how to implement a stack using ArrayDeque.
*
* Using ArrayDeque to implement a stack is more efficient than using a LinkedList because ArrayDeque is faster than LinkedList.
* */