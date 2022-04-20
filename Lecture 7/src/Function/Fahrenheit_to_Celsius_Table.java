package Function;
import java.util.Scanner;
public class Fahrenheit_to_Celsius_Table {
	
//	Given three values - Start Fahrenheit Value (S), End Fahrenheit value (E) and
//	Step Size (W), you need to convert all Fahrenheit values from Start to End at the gap of W, into
	//their corresponding Celsius values and print the table.
	
	public static void temperature(int S,int E,int W) { 
		
		while(S<=E)
		{
			int cel=(int)((5*(S-32))/9);
			
			 System.out.println(S+"\t"+cel);
			 S=S+W;
		}
		return;
		
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		    int S=s.nextInt();  //starting scale
		    int E=s.nextInt();  //ending scale
		    int W=s.nextInt();  //widthe b/w the scale
		    
		    temperature(S,E,W);
		    
		   
		 

	}

}
