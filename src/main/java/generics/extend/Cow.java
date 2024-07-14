package generics.extend;

public class Cow implements Animal{
	@Override
	public void eat () {
		System.out.println("Cow is eating");
	}

	@Override
	public void sound () {
		System.out.println("Cow Moos");
	}
}
