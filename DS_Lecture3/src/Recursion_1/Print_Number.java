package Recursion_1;

//Given is the code to print numbers from 1 to n in increasing order recursively. 
public class Print_Number {
	
	public static void print(int n){
		if(n == 1){
			System.out.print(n + " ");
            
		}
        else{
		
		print(n - 1);
            System.out.print(n+" ");
        }
	}

	public static void main(String[] args) {
		 int n=7;
		 print(n);

	}

}
