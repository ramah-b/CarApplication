package carPackage;

public abstract class Vehicle {
	private boolean engine;
	private int speed;
	private String color;
	private String make;

	
	public Vehicle(){
		this.setEngine(false);
		this.setSpeed(0);
		this.setColor("");
		this.setMake("");
		System.out.println("The vehicle is ready.");
	}
	
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
	public void start(int newSpeed){
		System.out.println("The vehicle is starting");
	}
	
	public void slow(int reducedSpeed) {
	
			System.out.println("The vehicle is slowing down.");
		
	}

	public void stop() {
	
			System.out.println("The vehicle has stopped.");
		

	}

	public void accelerate(int addedSpeed) {

			System.out.println("The vehicle is accelerating.");
	
	}

	public String getCarDetails() {
		return "The vehicle is a " + this.color.toLowerCase() + " " + this.make;
	}

	
	//method to print the speed in mph
	public void printSpeed() {
		System.out.println("The vehicle is going " + this.getSpeed() + "mph");
	}
	
}
