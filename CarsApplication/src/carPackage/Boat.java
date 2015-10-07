package carPackage;

public final class  Boat extends Vehicle {
	private boolean engine;
	private int speed;
	private String color;
	private String make;

	//constructor
	public Boat() {
		this.engine = false;
		this.speed = 0;
		System.out.println("The boat is ready.");
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
			System.out.println("The boat is sailing.");
		} else {
			System.out.println("There was an issue sailing the boat.");
		}

	}

	//method to slow down a boat
	public void slow(int reducedSpeed) {
		if (this.engine) {
			int newSpeed;
			newSpeed = this.getSpeed();
			newSpeed -= reducedSpeed;
			this.setSpeed(newSpeed);
			System.out.println("The boat is slowing down.");
		} else {
			System.out.println("Couldn't slow down!!!!");

		}

	}

	
	//method to stop a boat 
	public void stop() {
		if (this.engine) {
			this.engine = false;
			this.speed = 0;
			System.out.println("The boat has stopped.");
		} else {
			System.out.println("There was a problem stopping the boat.");
		}

	}

	
	//method to accelerate a boat
	public void accelerate(int addedSpeed) {
		if (this.engine) {
			int newSpeed;
			newSpeed = this.getSpeed();
			newSpeed += addedSpeed;
			this.setSpeed(newSpeed);
			System.out.println("The boat is accelerating.");
		} else {
			System.out.println("There was an issue accelerating the boat.");
		}

	}
	
	public String getCarDetails() {
		return "The boat is a " + this.color.toLowerCase() + " " + this.make;
	}

	
	//method to print the speed in knot
	public void printSpeed() {
		System.out.println("The boat is going " + this.getSpeed() + "knot.");
	}

}
