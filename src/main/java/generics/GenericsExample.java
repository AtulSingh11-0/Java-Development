package generics;

public class GenericsExample {
	public static void main ( String[] args ) {

		/*
		* Here as we can see that we have created a Printer class which prints an Integer value.
		* But what if we want to print a String value or a Double value. Then we have to create another class for that.
		* This is where Generics come into play. We can create a single class which can print any type of value.
		*
		* Printer class example without using Generics
		* */
//		Printer obj = new Printer(10);
//		obj.print();

		/*
		* We modified our Printer class to use Generics.
		* Now we can create a single class which can print any type of value.
		* So we mentioned the type to be Integer while creating the object.
		* before Java 7 we have to mention the type while creating the object over here also (new Printer<>) but after Java 7 we can skip mentioning the type while creating the object as it isn't necessary.
		*
		* */
		Printer<Integer> integerPrinter = new Printer<>(10);
		integerPrinter.print();

		Printer<String> stringPrinter = new Printer<>("Hello World");
		stringPrinter.print();

		Printer<Double> doublePrinter = new Printer<>(10.5);
		doublePrinter.print();

		Printer<Long> longPrinter = new Printer<>(1000000000L);
		longPrinter.print();
		/*
		* NOTE: Generics only work with reference types and not with primitive types.
		* eg: int, float, double, char, etc. are primitive types and not reference types. So they will give compile-time error
		*  if used with Generics.
		* */
	}
}
