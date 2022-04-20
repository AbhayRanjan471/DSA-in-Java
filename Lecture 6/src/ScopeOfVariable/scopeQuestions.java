package ScopeOfVariable;

public class scopeQuestions {

	public static void main(String[] args) {
//		 int a = 10;
//	        if(a > 5) {
//	            int b = 10;
//	        }
//	        System.out.println(b); // it shows error bcz we printing it outside the scope where there is no existance of 'b'
	    
		
//		 int a = 10;
//	        if(a > 5) {
//	            a = 100;
//	        }
//	        System.out.println(a); // it will print 'a' bcz int a is initilize outside the curly braces(outside the scope) 

		
//		 int a = 10;
//	        if(a > 5) {
//	            int a = 100; // it shows error bcz we cannot double initilize it
//	        }
//	        System.out.println(a);
		int a=10;
		 while(a > 5) {
		        int b = 1;
		        System.out.print(b + " ");
		        a--;
		 }
	        
	        
	    
	}

}
