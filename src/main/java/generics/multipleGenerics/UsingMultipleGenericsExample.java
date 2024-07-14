package generics.multipleGenerics;

public class UsingMultipleGenericsExample {
	public static void main ( String[] args ) {
		print( 10 );
		print( "Hello" );
		print( 10.5 );

		Character a = print('A'); // This will print 'A' is printed.
		System.out.println( a ); // This will print A which is returned from the print method.

		thingsTodo( "Eat", "Sleep" ); // This will print Eat and Sleep is done.
	}

	/*
	* This method can accept any type of data with the help of generics.
	* The type of data is decided at the time of calling the method.
	* We can also make this method generic by adding the type parameter in the method signature and this method will become a generic method.
	* eg: public static <T> T print ( T thingToPrint ) { return thingToPrint; }
	* */
	public static <T> T print ( T thingToPrint ) {
		System.out.println( thingToPrint + " is printed.");
		return thingToPrint;
	}

	/*
	* This method can accept any type of data with the help of generics.
	* We can also make this method generic by adding the type parameter in the method signature and this method will become a generic method just like the previous print method.
	* Multiple Generics come in handy when we want to accept multiple types of data in a single method.
	* eg: Map<K, V> map = new HashMap<>(); Here K and V are the type parameters, K is the key and V is the value.
	* */
	public static <A, B> void thingsTodo ( A thing1, B thing2 ) {
		System.out.println( thing1 + " and " + thing2 + " is done.");
	}
}
