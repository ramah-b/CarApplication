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

		myCar.printSpeedinMPH();

		myCar.slow(30);

		myCar.stop();

		System.out.println("\n\n");

		//second car
		Car myNewCar = new Car();

		myNewCar.setColor("Blue");
		myNewCar.setMake("Lexus");

		System.out.println(myNewCar.getCarDetails());

		myNewCar.start(20);

		myNewCar.accelerate(50);

		myNewCar.printSpeedinMPH();
		
		myNewCar.slow(50);

		myNewCar.stop();

	}
}
