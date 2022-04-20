package While_loop;
import java.util.Scanner;

 
public class FarehToCelciusTable {

	public static void main(String[] args) {
		
//		Given three values - Start Fahrenheit Value (S), End Fahrenheit value (E) and Step Size (W), 
		//you need to convert all Fahrenheit values from Start to End at the gap of W, into their 
		//corresponding Celsius values and print the table
		
		
		 Scanner a=new Scanner(System.in);
		    int S=a.nextInt();  //starting scale
		    int E=a.nextInt();  //ending scale
		    int W=a.nextInt();  //widthe b/w the scale
		    
		    while(S <= E)
		    {
		    	 int cel=(int)((5*(S-32))/9);
		    	System.out.println(S+"\t"+cel);
//		    	System.out.print("\t");
//		    	System.out.println( cel);
		    	
		    	S=S+W;
		    }

	}

}
