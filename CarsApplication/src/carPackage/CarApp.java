package carPackage;

public class CarApp {

	public static void main(String[] args) {

		//Car
		Car myCar = new Car();
		myCar.setColor("Red");
		myCar.setMake("Porsche");
		myCar.setNumOfPassangers(4); //this method is specific to the Car class
		System.out.println(myCar.getCarDetails());
		myCar.start(10);
		myCar.accelerate(40);
		myCar.printSpeed();
		myCar.slow(30);
		myCar.stop();

		System.out.println("\n\n");

		//Plane
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
