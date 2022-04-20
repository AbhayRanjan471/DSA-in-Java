package Vehicle;

public class Vehicle1 {
 
	protected String colour;//outside package if there is sub-class then 'protected' allow the access of its data member
	
	private int maxspeed; // now we have to use get-set function to access this from different class

	public int getMaxspeed() {
		return maxspeed;
	}
	
	public void setMaxspeed( int speed) {
		this.maxspeed=speed;
	}
	public void print() {
		System.out.println("vehicle colour :"+colour);
		System.out.println("Vehicle speed :"+maxspeed);
	}
	
}
