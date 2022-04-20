package Interface;

// A class can extends only one class but it can implement unlimited Interface
public class Car extends Vehicle implements VehicleInterface , CarInterface {

	//important point ** :- a non abstract class which is implementing an Interface must implement all the methods of the Interface
	//** an Interface can extend another Interface but cannot implement another Interface
	public void print() {
		
	}
	
	public int gatMaxSpeed() {
		return 12;
	}
	
	public String getCompany() {
		return null;
	}
}
 