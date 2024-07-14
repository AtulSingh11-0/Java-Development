package generics.extend;

/*
* We can restrict the type of object that can be passed to the Generic class using the extends keyword.
* which ensure type safety at compile time.
* We can also extend multiple classes and interfaces using the & operator.
* but we should always extend the class first and then implement the interface.
* */
public class GenericExtendsPrinter <T extends Animal> {
	private final T object;

	public GenericExtendsPrinter(T object) {
		this.object = object;
	}

	public void print() {
		System.out.println("This animal is a: " + object.getClass().getSimpleName());
		object.eat();
		object.sound();
	}
}
