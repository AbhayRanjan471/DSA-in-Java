package Polymorphism;

public class Car extends Vehicle{
	
	int numGears;
	boolean isConvertible;
	
	public Car(int numGears,int maxSpeed) {
		super(maxSpeed);
		
		this.numGears=numGears;
		
		System.out.println("Car is Constructor");
	}

	public boolean isConvertible() {
		return isConvertible;
	}
	public void print() {
		super.print();
		System.out.println("Car nuGears :"+ numGears);
		System.out.println("Car isConvertible :"+ isConvertible);
	}
}
