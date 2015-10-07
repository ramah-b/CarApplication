package carPackage;

public class Train extends Vehicle {
	
	private boolean engine;
	private int speed;
	private String color;
	private String make;

	//constructor
	public Train() {
		this.engine = false;
		this.speed = 0;
		System.out.println("The train is ready.");
	}

	
	public boolean isEngine() {
		return engine;
	}
	public void setEngine(boolean engine){
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
	
	
	public void start(int startSpeed) {
		if (!this.engine) {
			this.engine = true;
			this.speed = startSpeed;
			System.out.println("The train is starting.");
		} else {
			System.out.println("There was an issue starting the train.");
		}

	}

	//method to slow down a train
	public void slow(int reducedSpeed) {
		if (this.engine) {
			int newSpeed;
			newSpeed = this.getSpeed();
			newSpeed -= reducedSpeed;
			this.setSpeed(newSpeed);
			System.out.println("The train is slowing down.");
		} else {
			System.out.println("Couldn't slow down!!!!");

		}

	}

	
	//method to stop a train 
	public void stop() {
		if (this.engine) {
			this.engine = false;
			this.speed = 0;
			System.out.println("The train has stopped.");
		} else {
			System.out.println("There was a problem stopping the train.");
		}

	}

	
	//method to accelerate a train
	public void accelerate(int addedSpeed) {
		if (this.engine) {
			int newSpeed;
			newSpeed = this.getSpeed();
			newSpeed += addedSpeed;
			this.setSpeed(newSpeed);
			System.out.println("The train is accelerating.");
		} else {
			System.out.println("There was an issue accelerating the train.");
		}

	}
	
	public String getCarDetails() {
		return "The train is a " + this.color.toLowerCase() + " " + this.make;
	}

	
	//method to print the speed in mph
	public void printSpeed() {
		System.out.println("The train is going " + this.getSpeed() + "mph.");
	}

}
