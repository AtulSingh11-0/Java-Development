package generics.wildcards;

import generics.extend.Animal;

import java.util.List;

/*
 * This method prints the list of numbers
 * it can accept list of any type of numbers using wildcard.
 * wildcard are used to represent unknown type, they aren't Object type but can be any type.
 * which solves the problem of type safety, where we needed to make the method accept Object type and later cast it to the required type.
 * */
public class GenericListPrinter {

	// ? extends Number is a wildcard, it means it can accept any type of Number
	public void numberPrinter (List<? extends Number> list) {
		System.out.println(list);
	}

	// ? extends Animal is a wildcard, it means it can accept any type of Animal
	public void print (List<? extends Animal > list) {
		System.out.println(list);
	}
}
