package Abstract_Function_and_Classes;

public class VehicleUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Vehicle v = new Vehicle     ////3. we cannot create a vehicle type object bcz it contain an incomplete function
	
//		Vehicle v = new Car();   // now we cannot make object of class car bcz we have made it abstract
//	    v.isMotorrized();
//	    System.out.println(v.isMotorrized());
		
		Vehicle v = new BMW();
		System.out.println(v.isMotorrized());
		System.out.println( v.getCompany());
	}

}
