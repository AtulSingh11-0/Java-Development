package generics.wildcards;

import generics.extend.Cow;
import generics.extend.Lion;

import java.util.List;

public class WildCardExample {
	public static void main ( String[] args ) {

		// Creating object of GenericListPrinter
		GenericListPrinter obj = new GenericListPrinter();

		List<Integer> intList = List.of(1, 2, 3, 4, 5);
		obj.numberPrinter(intList); // prints [1, 2, 3, 4, 5]
		List<Double> doubleList = List.of(1.1, 2.2, 3.3, 4.4, 5.5);
		obj.numberPrinter(doubleList); // prints [1.1, 2.2, 3.3, 4.4, 5.5]

		List< Lion > lionList = List.of(new Lion(), new Lion(), new Lion());
		obj.print(lionList); // prints the list of Lion objects
		List< Cow > cowList = List.of(new Cow(), new Cow(), new Cow());
		obj.print(cowList); // prints the list of Cow objects
	}
}
