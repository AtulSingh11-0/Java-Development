package collectionFramework.listIterator;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/*
* This class demonstrates the use of ListIterator in Java.
* */
public class Main {
	public static void main ( String[] args ) {
		List<Integer>	list = new LinkedList<>(); // LinkedList is used here, but ListIterator can be used with any List implementation.

		// Adding elements to the list.
		for ( int i = 0; i < 10; i++ ) {
			list.add(i);
		}

		ListIterator< Integer > listIterator = list.listIterator(); // Getting the ListIterator object.
		StringBuilder sb = new StringBuilder(); // StringBuilder is used to print the next and previous list in a formatted way.
		sb.append( "Next List: [" ); // Appending the initial string to the StringBuilder object.
		while ( listIterator.hasNext() ) { // Iterating through the list using ListIterator.
			sb.append( listIterator.next() ); // Appending the element to the StringBuilder object.
			if ( listIterator.hasNext() ) { // If there are more elements in the list.
				sb.append( ", " ); // Appending a comma and a space.
			}
		}
		sb.append( "]" ); // Appending the closing bracket.
		System.out.println( sb ); // Printing the next List.

		sb = new StringBuilder(); // Reinitializing the StringBuilder object.
		sb.append( "Previous List: [" ); // Appending the initial string to the StringBuilder object.
		while ( listIterator.hasPrevious() ) { // Iterating through the list in reverse order using ListIterator.
			sb.append( listIterator.previous() ); // Appending the element to the StringBuilder object.
			if ( listIterator.hasPrevious() ) { // If there are more elements in the list.
				sb.append( ", " ); // Appending a comma and a space.
			}
		}
		sb.append( "]" ); // Appending the closing bracket.
		System.out.println( sb ); // Printing the previous List.
	}
}
/*
* We have a List of Integers, and we are adding elements from 0 to 9 to the list. We are then getting the ListIterator object using the list.listIterator() method.
* We are then iterating through the list using the ListIterator object and printing the elements in a formatted way. We are then iterating through the list in reverse order using the ListIterator object and printing the elements in a formatted way.
*
* ListIterator provides a way to iterate through the list in both directions. It provides methods like hasNext(), hasPrevious(), next(), and previous() to iterate through the list.
* It can be used with any List implementation like ArrayList, LinkedList, etc. but it is more efficient with LinkedList as it provides constant time performance for add, remove, get, and set operations.
*
* */