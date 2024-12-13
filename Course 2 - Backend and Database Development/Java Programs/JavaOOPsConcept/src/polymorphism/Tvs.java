package polymorphism;

public class Tvs extends Bike{

	public void color() {
		System.out.println("White");
	}
	@Override
	public void speed() {					// merge the code super class speed method + sub class speed
		super.speed();				// calling super class speed method.
		System.out.println("15km/hr");	// coding...
	}
}
