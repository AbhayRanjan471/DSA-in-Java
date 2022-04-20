package Interface;

public interface VehicleInterface { // here we have written public interface not public class 

	public final static double PI = 3.14; //if we are keeping any data member ,then we have to keeps its data member final static
	                                     // for only storing the constant we can keep data member in Interface other wise we will 
	                                     // be not storing data member in Interface
	
	public int getMaxSpeed(); // we have not written abstract then also its not showing error bcz its by-default abstract 
	public void print();
}
