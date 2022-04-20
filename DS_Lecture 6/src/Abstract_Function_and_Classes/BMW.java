package Abstract_Function_and_Classes;

public class BMW extends Car {

	// class BMW has tow option
	//1. either it declare itself an abstract class
   // 2. or it can implant the incomplete abstract function
	
	public String getCompany() {
		return null;
	}
}

// class Vehicle has left two incomplete function , now its mandatory for its sub-class to full fill its incompleteness 
// one is full filled by class Car
// nd the other is by class BMW
// after doing this now its bcm a complete class and now we can make an object of class BMW