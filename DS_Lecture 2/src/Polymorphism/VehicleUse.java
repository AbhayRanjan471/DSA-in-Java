package Polymorphism;

public class VehicleUse {

	public static void main(String[] args) {
		 
		Vehicle v =new Car(10,20); // every vehicle can be a Car as well
                                  // v can point toward any class which is sub-class of Vehicle
	                              // 'Vehicle v' can point towards a class bcz it is sub-class of Car
		                          // humlog Vehicle specific chije kr skte hai lakin Car specific cheje nai
		
		//boolean ans=v.isConvertible();// its shows error bcz here 'v' is referring to a Vehicle class and the vehicle class doesnot 
		                              // have a isConvertible function
		                              // we can do vehicle specific thing not car specific things bcz Vehicle is sub-class of car
		                              //mtlb car vehicle ke her chije us kr skta hai but vehicle car ki her chij us nai kr skta ,
		                                   // vehicle wahie chij us kr skta hai car ki jo dono me ho
	v.print();
	
	}

}
