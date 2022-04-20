package Polymorphism;

public class Vehicle {

   protected String colour;
   private int maxspeed;
   
   public Vehicle(int maxSpeed) {
	   this.maxspeed=maxSpeed;
   }
   
   public void print() {
	 System.out.println("Vehicle class");
   }
}
