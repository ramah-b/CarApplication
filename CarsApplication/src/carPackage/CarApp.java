package carPackage;

public class CarApp {

	public static void main(String[] args) {

		//first car
		Car myCar = new Car();

		myCar.setColor("Red");
		myCar.setMake("Porsche");

		System.out.println(myCar.getCarDetails());

		myCar.start(10);

		myCar.accelerate(40);

		myCar.printSpeed();

		myCar.slow(30);

		myCar.stop();

		System.out.println("\n\n");

		//second car
		Plane myFlight = new Plane();
		myFlight.setMake("Boeing");
		myFlight.setColor("White");
		System.out.println(myFlight.getCarDetails());
		myFlight.start(1000);
		myFlight.accelerate(2000);
		myFlight.printSpeed();
		
		myFlight.slow(2000);
		myFlight.stop();
		
		
	}
}
