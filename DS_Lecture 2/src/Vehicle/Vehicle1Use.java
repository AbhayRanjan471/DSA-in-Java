package Vehicle;

public class Vehicle1Use {

	public static void main(String[] args) {
		 
        Vehicle1 v =new Vehicle1();
        v.setMaxspeed(170);
        v.print();// vehicle k andar jo print function hai wo print ho ga
        
        Car1 c=new Car1();
        c.numGears=6;
        c.colour="white";
        c.setMaxspeed(220);
		c.print();  // 1st it will check is there any print() function is present in class Car1 if present then it will call that 
		// function and if not then it will go to it's parent class ie, class Vehicle1 and check is there any print() function 
		// is present if yes the it will call that function and inherit all the data to class Car1 and so on..
		 
		
		//c.printCar(); // this will inherit data from class Car1 , bcz the function call is printCar()
		 
		
	}

}
