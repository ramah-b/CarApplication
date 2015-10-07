package carPackage;

public class Car extends Vehicle{

	private boolean engine;
	private int speed;
	private int numOfPassangers;
	private int milage;
	private String color;
	private String make;

	//constructor
	public Car() {
		this.engine = false;
		this.speed = 0;
		this.numOfPassangers = 0;
		this.milage = 0;
		System.out.println("The car is ready.");
	}

	//setters & getters
	public boolean isEngine() {
		return engine;
	}

	public void setEngine(boolean engine) {
		this.engine = engine;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getNumOfPassangers() {
		return numOfPassangers;
	}
	public void setNumOfPassangers(int numOfPassangers) {
		this.numOfPassangers = numOfPassangers;
	}

	public int getMilage() {
		return milage;
	}

	public void setMilage(int milage) {
		this.milage = milage;
	}

	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	
	//method to start a car
	public void start(int startSpeed) {
		if (!this.engine) {
			this.engine = true;
			this.speed = startSpeed;
			System.out.println("The car is starting.");
		} else {
			System.out.println("There was an issue starting the car.");
		}

	}

	//method to slow down a car
	public void slow(int reducedSpeed) {
		if (this.engine) {
			int newSpeed;
			newSpeed = this.getSpeed();
			newSpeed -= reducedSpeed;
			this.setSpeed(newSpeed);
			System.out.println("The car is slowing down.");
		} else {
			System.out.println("Couldn't slow down!!!!");

		}

	}

	
	//method to stop a car 
	public void stop() {
		if (this.engine) {
			this.engine = false;
			this.speed = 0;
			System.out.println("The car has stopped.");
		} else {
			System.out.println("There was a problem stopping the car.");
		}

	}

	
	//method to accelerate a car
	public void accelerate(int addedSpeed) {
		if (this.engine) {
			int newSpeed;
			newSpeed = this.getSpeed();
			newSpeed += addedSpeed;
			this.setSpeed(newSpeed);
			System.out.println("The car is accelerating.");
		} else {
			System.out.println("There was an issue accelerating the car.");
		}

	}

	
	//method to calculate the Expected Time Of Arrival
	public void expectedTOA(int milage) {
		int totalMin, totalHours;
		double hoursPassed;

		hoursPassed = milage / this.getSpeed();
		totalHours = (int) hoursPassed;
		totalMin = (int) ((hoursPassed % totalHours) / 60);

		System.out.println("The car will be arriving in " + totalHours
				+ " hours and " + totalMin + " minutes.");

	}

	
	//method to return the car color and make
	public String getCarDetails() {
		return "The car is a " + this.color.toLowerCase() + " " + this.make;
	}

	
	//method to print the speed in mph
	public void printSpeed() {
		System.out.println("The car is going " + this.getSpeed() + "mph");
	}
}
