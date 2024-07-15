package memory;

/*
* This class demonstrates the use of Strong Reference in Java.
* */
public class StrongReferenceExample {
	public static void main ( String[] args ) {
		Employee emp = new Employee("John", 25); // Strong Reference
		System.out.println(emp); // print the value of emp which is not eligible for garbage collection

		emp = null; // emp is now eligible for garbage collection
		System.out.println(emp); // print the value of emp which is eligible for garbage collection
	}
}
/*
* Strong Reference is the most common type of reference in Java. Any object which has an active strong reference is not eligible for garbage collection.
* In the above example, emp is a strong reference to the Employee object. When emp is set to null, the Employee object is eligible for garbage collection.
* Strong Reference is the default type of reference in Java. If an object has a strong reference, it is not eligible for garbage collection.
* Strong Reference is used in most of the cases in Java.
*
* Strong Reference is used in the following cases:
* 1. When we want to keep an object in memory as long as it is reachable.
* 2. When we want to keep an object in memory as long as the reference to the object is in scope.
* 3. When we want to keep an object in memory as long as the reference to the object is not set to null.
* 4. When we want to keep an object in memory as long as the reference to the object is not re-assigned.
* 5. When we want to keep an object in memory as long as the reference to the object is not garbage collected.
*
* */