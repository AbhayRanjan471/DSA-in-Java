package Vehicle;

public class VechileUse {

	public static void main(String[] args) {
		 
		Vechile v= new Vechile();
		v.print();
       
		Car c=new Car();
		c.numGears=10;
		c.colour="Bleack";
		c.print_C();
		c.print();  // calss Car k pas print() function v hai kyu ki class Vechile k pas hai or class Car ne use Inheriite liye hai ,so we can use everything of class Vechile
	     
		//2nd question
//		  Car obj1 = new Car();
//	        obj1.print_C();
//	        obj1.print_V();
	}

}
