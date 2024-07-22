package collectionFramework.stack;

import java.util.Stack;

/*
* This class demonstrates the use of Stack class.
* */
public class StackImpl {
	public static void main ( String[] args ) {
		Stack<Integer> stack = new Stack<>(); // Stack is a class that extends Vector class

		// Adding elements to the stack
		for ( int i = 0; i < 5; i++) {
			stack.push(i);
		}

		System.out.println("Stack is: " + stack); // prints the stack
		System.out.println("Removed element: " + stack.pop()); // removes and returns the top of the stack
		System.out.println("Stack is: " + stack); // prints the stack
		System.out.println("Top of the stack: " + stack.peek()); // returns the top of the stack
	}
}
/*
* We can use the Stack class to create a stack. The Stack class extends the Vector class. The Vector class is synchronized, so the Stack class is also synchronized.
* The Stack class provides all the methods to perform the stack operations.
* Stack is used to store the elements in a LIFO (Last In First Out) order. The elements are added at the top of the stack and removed from the top of the stack.
*
* The push() method is used to add an element to the stack. It returns the element that is added to the stack.
* The pop() method is used to remove and return the top of the stack. It throws an EmptyStackException if the stack is empty.
* The peek() method is used to return the top of the stack. It throws an EmptyStackException if the stack is empty.
* The search() method is used to search for an element in the stack. It returns the 1-based position of the element from the top of the stack. It returns -1 if the element is not found in the stack.
*
* */