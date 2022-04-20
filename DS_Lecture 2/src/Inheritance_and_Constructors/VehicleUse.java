package Inheritance_and_Constructors;

import Vehicle.Car1;
import Vehicle.Vehicle1;

public class VehicleUse {

	public static void main(String[] args) {
		 
//		  Vehicle v =new Vehicle();
//	        v.setMaxspeed(170);
	       // v.print();// vehicle k andar jo print function hai wo print ho ga
	        
	        Car c=new Car(6); // here we are making object of derived class BUt parent class object is also created
	                        // derived class and parent class constructor both will be called
	      
	        // c.numGears=6;
	       // c.colour="white";
	      //  c.setMaxspeed(220);
			//c.print(); 

	}

}
