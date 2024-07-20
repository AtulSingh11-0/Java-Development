package collectionFramework.iterator;

import java.util.ArrayList;
import java.util.Iterator;

/*
* This class is used to demonstrate the use of the Iterator interface.
* */
public class Main {
	public static void main ( String[] args ) {
		GenericList<Integer> list = new GenericList<>(); // This is a custom implementation of a list.
		for ( int i = 1; i <= 20; ++i ) // Adding elements to the list.
			list.add(i);

		System.out.print("Using forEach -> ");
		list.forEach( i -> System.out.print(i + ", ") );  // Using the forEach method of the Iterable interface.

		System.out.print("\nUsing enhanced for loop -> ");
		for ( Integer i : list ) { // Using the enhanced for loop.
			System.out.print(i + ", ");
		}

		System.out.print("\nUsing forEachRemaining -> ");
		list.iterator().forEachRemaining( i -> System.out.print(i + ", ") ); // Using the forEachRemaining method of the
		// Iterator interface.

		System.out.print("\nUsing Iterator -> ");
		Iterator< Integer > iterator = list.iterator(); // Using the Iterator interface.
		while ( iterator.hasNext() ) { // Using the hasNext and next methods of the Iterator interface.
			System.out.print(iterator.next() + ", "); // Using the next method of the Iterator interface.
		}
	}
}
/*
* We have a custom implementation of a list called GenericList. We have added elements to the list using the add method.
* We have used the forEach method of the Iterable interface to print the elements of the list.
* We have used the enhanced for loop to print the elements of the list.
* We have used the forEachRemaining method of the Iterator interface to print the elements of the list.
* We have used the Iterator interface to print the elements of the list.
*
* */