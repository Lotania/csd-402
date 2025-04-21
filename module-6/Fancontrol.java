//Anthony Nguyen, Assignment 6, 04/20/2025
//The purpose of this program is to demonstrate the basics of
//classes and objects.

public class Fancontrol {
	public static void main(String[] args) {
		Fan myFan1 = new Fan();//no-argument constructor
		Fan myFan2 = new Fan(2, true, 20, "gray");
		
		System.out.println("The fan's speed setting is " + myFan1.getSpeed() + ".\nIs the fan on? " + myFan1.getOn() + "\nThe fan's radius is " + myFan1.getRadius() + " inches.\nThe fan's color is " + myFan1.getColor() + ".\n");
		System.out.println("The fan's speed setting is " + myFan2.getSpeed() + ".\nIs the fan on? " + myFan2.getOn() + "\nThe fan's radius is " + myFan2.getRadius() + " inches.\nThe fan's color is " + myFan2.getColor());
	}
}

class Fan{

	//cannot use all caps variable names in java. must use lower case
	static final int stopped = 0;
	static final int slow = 1;
	static final int medium = 2;
	static final int fast = 3;
	
	//getters and setters for all mutable fields. privates are still mutable 
	private int speed;
	public int getSpeed(){
		return speed;
	}
	public void setSpeed(int newSpeed){
		this.speed = newSpeed;
	}
	
	private Boolean on;
	public Boolean getOn(){
		return on;
	}
	public void setOn(Boolean newOn){
		this.on = newOn;
	}
	
	private int radius;
	public int getRadius(){
		return radius;
	}
	public void setRadius(int newRadius){
		this.radius = newRadius;
	}
	
	String color;
	public String getColor(){
		return color;
	}
	public void setColor(String newColor){
		this.color = newColor;
	}
	
	public Fan(){//no argument constructor takes the default values
		speed = stopped;
		on = false;
		radius = 6;
		color = "white";
	}
	
	public Fan (int speed, Boolean on, int radius, String color){//all parameters must be fulfilled
		this.speed = speed;
		this.on = on;
		this.radius = radius;
		this.color = color;
	}
	
}