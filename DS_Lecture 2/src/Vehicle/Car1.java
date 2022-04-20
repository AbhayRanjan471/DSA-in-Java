package Vehicle;

public class Car1 extends Vehicle1{

	int numGears;
	boolean isConvertible;
	
	public void print() {
//		System.out.println("Car Colour :"+ colour);
//		System.out.println("Car Speed :"+ getMaxspeed());//the class car1 don't have the direct access of  the 'maxspeed' directly from the class Vehicle1 
		//bcz its data type is private ,so we have to use get-set function to access it.
		   
		super.print(); // insedad of line 9 and 10 we can write this to access class Vehicle1 ie, (parent class) also know as super class
		               // using super-keyword we can access data members and function of our parent class
		
		System.out.println("Car numGears :"+ numGears);
		System.out.println("Car isConvertible :"+ isConvertible);
	}
	
}

//		public void printCar() {
//			System.out.println("Car Colour :"+ colour);
//			System.out.println("Car Speed :"+ getMaxspeed());//the class car1 don't have the direct access of  the 'maxspeed' directly from the class Vehicle1 
//			//bcz its data type is private ,so we have to use get-set function to access it.
//			                                           
//			System.out.println("Car numGears :"+ numGears);
//			System.out.println("Car isConvertible :"+ isConvertible);
	
//}
//}
