package Polymorphism;

public class VehicleUse1 {

	public static void main(String[] args) {
	
		 Vehicle1 obj1 = new Car1();// Car class will be called first if the class Car contain print() function then it will call that 
		                            // nd if not present then it will go the the Vehicle class and call the print function
		    obj1.print();

		    Vehicle1 obj2 = new Vehicle1();
		    obj2.print(); 

	}

}
