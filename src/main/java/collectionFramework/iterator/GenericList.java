package collectionFramework.iterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Spliterator;
import java.util.function.Consumer;

/*
* This class is a custom implementation of a list.
* */
public class GenericList<T> implements Iterable<T> {
	private T[] items; // This array will store the elements of the list.
	private int size = 0; // This variable will store the number of elements in the list.
	private static final int DEFAULT_SIZE = 10; // This variable stores the default size of the list.

	/*
	* This constructor initializes the array items with the default size.
	* */
	public GenericList () {
		items = (T[]) new Object[DEFAULT_SIZE];
	}

	/*
	* This method adds an element to the list and resizes the list if it is full.
	* */
	public void add ( T item) {
		if ( isFull() ) { resize(); } // Resizing the list if it is full.
		items[size ++ ] = item; // Adding the element to the list.
	}

	/*
	* This method returns the element at the specified index.
	* */
	public T get ( int index ) {
		return items[ index ]; // Returning the element at the specified index.
	}

	/*
	* This method returns the number of elements in the list.
	* */
	public int size () {
		return size; // Returning the number of elements in the list.
	}

	/*
	* This method sets the element at the specified index.
	* */
	public void set ( T item, int index ) {
		items [ index ] = item; // Setting the element at the specified index.
	}

	/*
	* This method removes the last element from the list.
	* */
	public T remove () {
		return items [ -- size ]; // Removing the last element from the list.
	}

	/*
	* This method removes the element at the specified index.
	* */
	public T remove ( int index ) {
		T item = items [ index ]; // Storing the element at the specified index.
		System.arraycopy(items, index + 1, items, index, size - index - 1); // Shifting the elements to the left.
		size --; // Decreasing the size of the list.
		return item; // Returning the removed element.
	}

	/*
	* This is the implementation of the overridden toString method.
	* */
	@Override
	public String toString () {
		return "GenericList=" + Arrays.toString(items); // Returning the string representation of the list.
	}

	/*
	* This is the implementation of the overridden iterator method.
	* */
	@Override
	public Iterator< T > iterator () {
		return new ListIterator(this); // Returning an instance of the ListIterator class.
	}

	/*
	* This is the implementation of the overridden forEach method.
	* */
	@Override
	public void forEach ( Consumer< ? super T > action ) {
		Iterable.super.forEach(action); // Calling the forEach method of the Iterable interface.
	}

	/*
	* This is the implementation of the overridden spliterator method.
	* */
	@Override
	public Spliterator< T > spliterator () {
		return Iterable.super.spliterator(); // Calling the spliterator method of the Iterable interface.
	}

	/*
	* This method checks if the list is full.
	* */
	private boolean isFull () {
		return size == items.length; // Returning true if the list is full.
	}

	/*
	* This method resizes the list.
	* */
	private void resize () {
		T[] newItems = (T[]) new Object[items.length * 2 ]; // Creating a new array with double the size of the current array.
		System.arraycopy(items, 0, newItems, 0, items.length); // Copying the elements of the current array to the new array.
		items = newItems; // Assigning the new array to the current array.
	}

	/*
	* This class is an implementation of the Iterator interface.
	* */
	private class ListIterator implements Iterator <T> {
		private GenericList<T> list; // This variable stores the list.
		private int index = 0; // This variable stores the index of the list.

		/*
		* This constructor initializes the list.
		* */
		public ListIterator ( GenericList<T> list ) {
			this.list = list; // Assigning the list to the variable.
		}

		/*
		* This method checks if there are more elements in the list.
		* */
		@Override
		public boolean hasNext () {
			return index < list.size(); // Returning true if there are more elements in the list.
		}

		/*
		* This method returns the next element in the list.
		* */
		@Override
		public T next () {
			try {
				return list.get( index ++ ); // Returning the next element in the list.
			} catch ( ArrayIndexOutOfBoundsException e ) { // Catching the ArrayIndexOutOfBoundsException.
				throw new NoSuchElementException(); // Throwing a NoSuchElementException.
			}
		}

		/*
		* This method removes the last element returned by the next method.
		* */
		@Override
		public void remove () {
			Iterator.super.remove(); // Calling the remove method of the Iterator interface.
		}

		/*
		* This method performs the given action for each remaining element in the list.
		* */
		@Override
		public void forEachRemaining ( Consumer< ? super T > action ) {
			Iterator.super.forEachRemaining(action); // Calling the forEachRemaining method of the Iterator interface.
		}
	}
}
/*
* We have a custom implementation of a list called GenericList. We have added elements to the list using the add method.
* We have implemented the Iterable interface to make the list iterable and also create an iterator for the list.
* We have overridden the iterator, forEach, and spliterator methods of the Iterable interface.
* We have implemented the Iterator interface to create an iterator for the list. We have overridden the hasNext, next, remove, and forEachRemaining methods of the Iterator interface.
* We have used the ListIterator class to implement the Iterator interface.
* We have used the ArrayIndexOutOfBoundsException and NoSuchElementException classes to handle exceptions.
* We have used the System.arraycopy method to shift the elements of the list to the left.
*
* To make the GenericList class iterable, we have implemented the Iterable interface and overridden the iterator
* method. We have created an instance of the ListIterator class in the iterator method and returned it.
* */