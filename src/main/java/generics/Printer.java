package generics;

public class Printer <T> {

	/*
	* Here as we can see that we have created a Printer class which prints an Integer value.
	* But what if we want to print a String value or a Double value. Then we have to create another class for that.
	* This is where Generics come into play. We can create a single class which can print any type of value.
	* We just have to mention the type we want within angular brackets ('<', '>') after the class name.
	*
	* */
	/*Integer toPrint;

	public Printer ( Integer toPrint ) {
		this.toPrint = toPrint;
	}

	public void print () {
		System.out.println("Integer value is: " + toPrint);
	}*/

	/*
	* Here is the Printer class example using Generics
	* The type parameter 'T' is the type of object that we want to use.
	* it'll be replaced by the actual type when we create an object of this class, for that we have to mention the type within angular brackets ('<', '>') after the class name.
	*
	* */
	T toPrint;

	public Printer ( T toPrint ) {
		this.toPrint = toPrint;
	}

	public void print () {
		System.out.println("Value is: " + toPrint);
	}
}
