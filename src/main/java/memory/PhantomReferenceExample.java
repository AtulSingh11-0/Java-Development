package memory;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

/*
* This class demonstrates the use of PhantomReference in Java.
* */
public class PhantomReferenceExample {
	public static void main ( String[] args ) {
		Employee emp = new Employee( "John", 23);

		ReferenceQueue<Employee> referenceQueue = new ReferenceQueue<>();

		PhantomReference<Employee> phantomReference = new PhantomReference<>(emp, referenceQueue);
		System.out.println( "phantomReference.get() = " + phantomReference.get() );

//		emp = null;

		System.out.println( "phantomReference.get() = " + phantomReference.get() );
	}
}
