package collectionFramework.list;

import java.util.ArrayList;
import java.util.List;

/*
* This class demonstrates the usage of ArrayList class in Java.
* */
public class ArrayListExample {
	/*
	* Constants
	* */
	private static final String LIST_1 = "List-1: ";
	private static final String SUB_LIST = "Sub-List: ";

	public static void main ( String[] args ) {
		List<Integer> list = new ArrayList<>(); // Creating an ArrayList

		// Adding elements to the list
		for ( int i = 0; i < 10; i++ ) {
			list.add(i);
		}

		System.out.println(LIST_1 + list); // Printing the list

		List< Integer > subList = list.subList(5, 10); // Creating a sub-list from the list

		System.out.println(SUB_LIST + subList); // Printing the sub-list

		subList.set(0, 100); // Updating the sub-list

		System.out.println(LIST_1 + list); // Printing the list
		System.out.println(SUB_LIST + subList); // Printing the sub-list

		subList.add(200); // Adding an element to the sub-list

		System.out.println(LIST_1 + list); // Printing the list
		System.out.println(SUB_LIST + subList); // Printing the sub-list
	}
}
/*
* We can see that the sub-list is backed by the original list. So, any changes made to the sub-list will be reflected in the original list.
* This is because the sub-list is just a view of the original list. It is not a separate list. It is just a part of the original list.
* Also, we can see that we can add elements to the sub-list.
* All the methods of the List interface are common to the ArrayList class and the other classes that implement the List interface.
* */