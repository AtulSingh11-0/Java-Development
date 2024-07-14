package generics.extend;

public class UsingGenericsWithExtendsExample {
	public static void main ( String[] args ) {
		GenericExtendsPrinter<Cow> cowPrinter = new GenericExtendsPrinter<>(new Cow());
		cowPrinter.print();

		GenericExtendsPrinter<Lion> lionPrinter = new GenericExtendsPrinter<>(new Lion());
		lionPrinter.print();

		/*
		* GenericExtendsPrinter<Integer> integerPrinter = new GenericExtendsPrinter<>(1);
		* if we write the above line, we will get a compilation error because Integer is not a subclass of Animal.
		* using extends keyword we can restrict the type of object that can be passed to the Generic class.
		* which ensure type safety at compile time.
		* */
	}
}
