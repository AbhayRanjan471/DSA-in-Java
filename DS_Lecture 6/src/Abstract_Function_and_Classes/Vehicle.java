package Abstract_Function_and_Classes;

public abstract  class Vehicle {
	
	public abstract boolean isMotorrized(); //1. it's an incomplete function ,to make it complete we have to also
	                                        //make the class abstract ie,(abstract class Vehicle)
	                                        //2. By making an abstract class it bcm mandatory for all the sub-class to define this function
                                            //3. we cannot create a vehicle type object bcz it contain an incomplete function
	
	 public abstract String getCompany(); // again we have declare an incomplete abstract function ,now we have to make the class abstract
}
