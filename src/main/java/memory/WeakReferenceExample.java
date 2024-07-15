package memory;

import java.lang.ref.WeakReference;

/*
* This class demonstrates the use of WeakReference in Java.
* */
public class WeakReferenceExample {
	public static void main ( String[] args ) {

		String str = new String("Hello World"); // Create a new object
		WeakReference<String> weakReference = new WeakReference<>(str); // Create a weak reference to the object

		System.out.println(weakReference.get()); // Check if the object is still reachable

		str = null; // Remove the strong reference to the object
		System.gc(); // Call the garbage collector

		System.out.println(weakReference.get()); // Check if the object is still reachable
	}
}
/*
* Weak Reference is a type of reference that does not prevent the object from being garbage collected.
* If the object is only weakly reachable, it can be garbage collected.
* Weak references are useful for implementing memory-sensitive caches.
* When the garbage collector runs, it will remove the weakly reachable objects and their associated weak references.
* In this example, we create a new String object and create a weak reference to it. We then remove the strong reference to the object and call the garbage collector.
* The object is no longer reachable and is garbage collected, so the weak reference returns null.
* If you want to cache an object but allow it to be garbage collected when memory is low, you can use a weak reference.
*
* */
