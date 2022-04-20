package Inheritance_and_Constructors;

public class Car extends Vehicle {

	int numGears;
	boolean isConvertible;
	
	public Car(int numGears) {
	
		super(100);// by using super we will pass maxSpeed
		           // here we are specifically calling the constructor of class Vehicle
		this.numGears=numGears;
		System.out.println("Car Constructor");
		
	}
	
	
//	public void print() {
//		super.print();
//		
//		System.out.println("Car numGears :"+ numGears);
//		System.out.println("Car isConvertible :"+ isConvertible);
//	}
}
