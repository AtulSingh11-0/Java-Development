package memory;

import java.lang.ref.SoftReference;

/*
* This class demonstrates the use of SoftReference in Java.
* */
public class SoftReferenceExample {
	public static void main ( String[] args ) {

		Employee emp = new Employee ( "John Doe", 30 ); // Create a new object
		SoftReference<Employee> softRef = new SoftReference<>( emp ); // Create a soft reference to the object

		emp = null; // Make the object eligible for garbage collection
		Employee empRef = softRef.get (); // Get the object from the soft reference

		if ( empRef != null ) { // Check if the object is still available
			System.out.println ( "Employee name: " + empRef.getName () ); // Print the name of the employee
		} else { // If the object has been garbage collected
			System.out.println ( "Employee object has been garbage collected" ); // Print a message
		}
	}
}
/*
* Soft Reference is a type of reference in Java that is not eagerly garbage collected. It is garbage collected only when the JVM is running out of memory.
* In this example, we create a new Employee object and create a SoftReference to it. We then make the Employee object eligible for garbage collection by setting it to null.
* We then try to get the object from the SoftReference. If the object is still available, we print the name of the employee. If the object has been garbage collected, we print a message.
*
* SoftReference is useful when you want to keep a reference to an object, but you don't want to prevent it from being garbage collected. It is useful for caching and memoization.
* In this example, the Employee object is garbage collected because we set it to null before trying to get it from the SoftReference. If we had not set it to null, the object would not have been garbage collected.
*
* */