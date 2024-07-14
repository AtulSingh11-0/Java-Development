package generics.extend;

public class Lion implements Animal{
	@Override
	public void eat () {
		System.out.println("Lion is eating");
	}

	@Override
	public void sound () {
		System.out.println("Lion Roars");
	}
}
