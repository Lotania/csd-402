//Anthony Nguyen, Assignment 7, 04/20/2025
//The purpose of this program is to demonstrate utilization of
//collection of objects, using a carbon copy of the program for Assignment 6.

import java.util.ArrayList;
import java.util.*;

public class UseFans {
	public static void main(String[] args) {
		//the no-argument instance and yes-argunemt instance from Assignment 6 will stay
		Fan myFan1 = new Fan();
		Fan myFan2 = new Fan(2, true, 20, "gray");
		
		//these instances are added
		Fan myFan3 = new Fan(3, false, 6, "yellow");
		Fan myFan4 = new Fan(0, true, 18, "blue");
		Fan myFan5 = new Fan(3, true, 42, "white");
		Fan myFan6 = new Fan(1, false, 7, "orange");
		Fan myFan7 = new Fan(1, false, 26, "green");
		Fan myFan8 = new Fan(2, true, 31, "purple");
		
		myFan6.FanOut();//method for one instance
		
		//assemble collection of fans
		ArrayList<Fan> fanC = new ArrayList<Fan>();
		fanC.add(myFan1);
		fanC.add(myFan2);
		fanC.add(myFan3);
		fanC.add(myFan4);
		fanC.add(myFan5);
		fanC.add(myFan7);
		fanC.add(myFan8);
		
		//set collection in class proper
		Fan fanList = new Fan(fanC);
		//method for all instances of fan
		fanList.FansOut();
		
	}
}

class Fan{
	//set constants
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
	public void setOn(Boolean on){
		this.on = on;
	}
	
	private int radius;
	public int getRadius(){
		return radius;
	}
	public void setRadius(int radius){
		this.radius = radius;
	}
	
	String color;
	public String getColor(){
		return color;
	}
	public void setColor(String color){
		this.color = color;
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
	
	public void FanOut(){//method for one instance (without using toString)
		System.out.println("The fan's speed setting is " + speed + ".\nIs the fan on? " + on + "\nThe fan's radius is " + radius + " inches.\nThe fan's color is " + color + ".\n");
	}
	
	
	private ArrayList<Fan> fanList;
	
	public Fan(ArrayList<Fan> fanList) {
		this.fanList = fanList;
	}

	public void FansOut(){//method for all instances (again, without using toString)
		for(Fan data: fanList){
			System.out.println("The fan's speed setting is " + data.speed + ".\nIs the fan on? " + data.on + "\nThe fan's radius is " + data.radius + " inches.\nThe fan's color is " + data.color + ".\n");
		}
	}
}