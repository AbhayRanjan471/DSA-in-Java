package Inheritance_and_Constructors;

public class Vehicle {

protected String colour;//outside package if there is sub-class then 'protected' allow the access of its data member
	
	private int maxspeed; // now we have to use get-set function to access this from different class

	public Vehicle(int maxSpeed){ // here we have made parameterized constructor ,so if we want to call this constructor using 
		                          // derived class(ie, class Car ) we have to use 'super()' in derived class and here we can pass the value of parent class
		
		this.maxspeed=maxSpeed;
		System.out.println("Vehicle Constructor");
		System.out.println("Max Speed : " +maxspeed);
	}
	
	
//	public int getMaxspeed() {
//		return maxspeed;
//	}
//	
//	public void setMaxspeed( int speed) {
//		this.maxspeed=speed;
//	}
//	public void print() {
//		System.out.println("vehicle colour :"+colour);
//		System.out.println("Vehicle speed :"+maxspeed);
//	}
}
