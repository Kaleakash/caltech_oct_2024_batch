package abstractinfo;

public class Honda extends Bike{
	public void speed() {
		System.out.println("50km/hr");
	}
	
	@Override
	public void mailage() {
		System.out.println("80km/lt");
	}
}
