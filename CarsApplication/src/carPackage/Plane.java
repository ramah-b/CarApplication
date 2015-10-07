package carPackage;

public class Plane extends Vehicle{

private boolean engine;
private int speed;
private String color;
private String make;

//constructor
public Plane() {
	this.engine = false;
	this.speed = 0;
	System.out.println("The plane is ready.");
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
		System.out.println("The plane is taking off.");
	} else {
		System.out.println("There was an issue starting the plane.");
	}

}

//method to slow down a plane
public void slow(int reducedSpeed) {
	if (this.engine) {
		int newSpeed;
		newSpeed = this.getSpeed();
		newSpeed -= reducedSpeed;
		this.setSpeed(newSpeed);
		System.out.println("The plane is starting to land.");
	} else {
		System.out.println("Couldn't start landing!!!!");

	}

}


//method to stop a plane 
public void stop() {
	if (this.engine) {
		this.engine = false;
		this.speed = 0;
		System.out.println("The plane has landed.");
	} else {
		System.out.println("There was a problem landing the plane.");
	}

}


//method to accelerate a plane
public void accelerate(int addedSpeed) {
	if (this.engine) {
		int newSpeed;
		newSpeed = this.getSpeed();
		newSpeed += addedSpeed;
		this.setSpeed(newSpeed);
		System.out.println("The plane is accelerating.");
	} else {
		System.out.println("There was an issue accelerating the plane.");
	}

}

public String getCarDetails() {
	return "The plane is a " + this.color.toLowerCase() + " " + this.make;
}


//method to print the speed in mph
public void printSpeed() {
	System.out.println("The plane is going " + this.getSpeed() + "mph.");
}


}
