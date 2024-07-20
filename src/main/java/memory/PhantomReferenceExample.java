package memory;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

/*
* This class demonstrates the use of PhantomReference in Java.
* */
public class PhantomReferenceExample {
	public static void main ( String[] args ) {
		Employee emp = new Employee( "John", 23); // Strong Reference
		System.out.println( "emp before phantom reference: " + emp ); // printing the object before phantom reference

		ReferenceQueue<Employee> referenceQueue = new ReferenceQueue<>(); // ReferenceQueue to store the reference of the object

		PhantomReference<Employee> phantomReference = new PhantomReference<>(emp, referenceQueue); // Phantom Reference of the object

		emp = null; // Making the object eligible for garbage collection
		emp = phantomReference.get(); // Trying to get the object from the phantom reference
		System.out.println( "emp after phantom reference: " + emp ); // printing the object after phantom reference
	}
}
/*
* Phantom Reference is a type of reference in Java that is eagerly garbage collected. It is garbage collected as soon as the object is no longer reachable.
* In this example, we create a new Employee object and create a PhantomReference to it. We then make the Employee object eligible for garbage collection by setting it to null.
* We then try to get the object from the PhantomReference. If the object is still available, we print the object. If the object has been garbage collected, we print a message.
* PhantomReference is useful when you want to perform some cleanup operation when an object is garbage collected. It is useful for resource management.
 * The Employee object is garbage collected as soon as it is no longer reachable. The object is not available from the PhantomReference, so we print a message.
*
* */